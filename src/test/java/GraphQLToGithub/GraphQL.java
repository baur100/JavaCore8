package GraphQLToGithub;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GraphQL {
    @Test
    public void getUser(){
        String token = "Bearer dfcdeaae3952eaee9ebac9d5df78e95359f3b169";
        String body = "{\"query\":\"query($username:String!){\\r\\n    user(login:$username){\\r\\n        name,\\r\\n        location,\\r\\n        url\\r\\n    }\\r\\n}\",\"variables\":{\"username\":\"Kras39\"}}";
        Response response =
                given()
                        .baseUri("https://api.github.com")
                        .basePath("api/playlist")
                        .header()
                        .header()
                        .body()
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        playlistId = jsonPath.getInt("id");
        System.out.println();

    }
}
