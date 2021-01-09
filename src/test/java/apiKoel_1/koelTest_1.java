package apiKoel_1;

import com.github.javafaker.Faker;
import helper.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import models.RenamePlaylistRequest;
import models.RenamePlaylistResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class koelTest_1 {
    public int playlistId;
    private String token;
    private String baseUrl;
    Faker faker;
    @BeforeClass
    private void runOnce(){
        faker = new Faker();
        baseUrl = "https://koelapp.testpro.io/";
        token = Token.get();
    }
    @BeforeMethod
    public void startUp(){
        String endPoint = "api/playlist";
        String playlistName = faker.artist().name();
        System.out.println(playlistName);
        CreatePlaylistRequest createPlaylistRequest = new CreatePlaylistRequest(playlistName);
        Response response = given()
                .baseUri(baseUrl)
                .basePath(endPoint)
                .header("Content-type", "application/json")
                .header("Authorization",token)
                .body(createPlaylistRequest)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse createPlaylistResponse = jsonPath.getObject("$", CreatePlaylistResponse.class);
        playlistId = createPlaylistResponse.getId();
        Assert.assertEquals(playlistName,createPlaylistResponse.getName());
    }
    @AfterMethod
    public void tearDown(){
        String endPoint = "api/playlist/"+playlistId;
        given()
                .baseUri(baseUrl)
                .basePath(endPoint)
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void playlistManagement_renamePlaylist_playlistRenamed(){
        String endPoint = "api/playlist/"+playlistId;
        String name = faker.backToTheFuture().character();
        System.out.println(name);
        RenamePlaylistRequest renamePlaylistRequest = new RenamePlaylistRequest(name);

        Response response = given()
                .baseUri(baseUrl)
                .basePath(endPoint)
                .header("Content-type", "application/json")
                .header("Authorization",token)
                .body(renamePlaylistRequest)
                .when()
                .put()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        RenamePlaylistResponse renamePlaylistResponse = jsonPath.getObject("$",RenamePlaylistResponse.class);
        Assert.assertEquals(name,renamePlaylistResponse.getName());
        Assert.assertEquals(playlistId,renamePlaylistResponse.getId());
    }
}