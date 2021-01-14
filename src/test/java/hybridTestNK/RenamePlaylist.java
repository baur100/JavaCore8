package hybridTestNK;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helper.BrowserFabric;
import helper.Token;
import homework24.LoginPageNK;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import modelsNK.CreatePlaylistRequest;
import modelsNK.CreatePlaylistResponse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import static io.restassured.RestAssured.given;

public class RenamePlaylist {
    private String playlistId;
    private String token;
    private String baseUrl;
    Faker faker;
    WebDriver driver;

    @BeforeClass
    private void runOnce() {
        faker = new Faker();
        baseUrl = "https://koelapp.testpro.io/";
        token = Token.get();
    }

    @BeforeMethod
    public void startUp() {
        String endPoint = "api/playlist";
        String playlistName = faker.artist().name();
        System.out.println(playlistName);
        CreatePlaylistRequest createPlaylistRequest = new CreatePlaylistRequest(playlistName);
        Response response = given()
                .baseUri(baseUrl)
                .basePath(endPoint)
                .header("Content-type", "application/json")
                .header("Authorization", token)
                .body(createPlaylistRequest)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse createPlaylistResponse = jsonPath.getObject("$", CreatePlaylistResponse.class);
        playlistId = createPlaylistResponse.getId()+"";
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
        String endPoint = "api/playlist/"+playlistId;
        given()
                .baseUri(baseUrl)
                .basePath(endPoint)
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void renamePlaylist_playlistRenamed(){
        var loginPage = new LoginPageNK(driver);
        loginPage.open();
        var mainPageNK = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        var name = faker.animal().name();
        System.out.println(name);
        mainPageNK.renamePlaylist(playlistId,name);
        Assert.assertTrue(mainPageNK.isPlaylistExist(playlistId,name));
    }
}
