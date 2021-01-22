package hybridTest;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helper.BrowserFabric;
import helper.DbAdapter;
import helper.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import static io.restassured.RestAssured.given;

public class RenamePlaylistCheckUsingDb {
    private String token;
    private String baseUrl;
    private Faker faker;
    private int playlistId;
    private WebDriver driver;
    @BeforeClass
    public void runBeforeClass(){
        token= Token.get();
        baseUrl = "https://koelapp.testpro.io/";
        faker=new Faker();
    }

    @BeforeMethod
    public void startUp(){
        driver = BrowserFabric.getDriver(BrowserType.FIREFOX);
        String playlistName = faker.animal().name();
        CreatePlaylistRequest createPlaylistRequest = new CreatePlaylistRequest(playlistName);
        Response response = given()
                .baseUri(baseUrl)
                .basePath("api/playlist")
                .header("Authorization",token)
                .header("Content-type", "application/json")
                .body(createPlaylistRequest)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        playlistId = jsonPath.getInt("id");
        System.out.println(playlistName+" "+playlistId);
    }
    @AfterMethod
    public void afterTest(){
        driver.quit();
//        given().baseUri(baseUrl+"api/playlist/"+playlistId).header("Authorization",token).when().delete();
    }
    @Test
    public void renamePlaylist_PlaylistRenamed(){
        String newName = faker.address().cityName();
        System.out.println(newName);
        var loginPage = new LoginPage(driver);
        loginPage.open();
        var mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        mainPage.renamePlaylist(playlistId+"",newName);
        var fromDb = DbAdapter.getPlaylist(playlistId);
        Assert.assertEquals(newName,fromDb.getName());
    }


}
