package helper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Credentials;

import static io.restassured.RestAssured.given;

public class Token {
    public static String get() {
        String baseUrl = "https://koelapp.testpro.io/";
        String endPoint = "api/me";
        Credentials credentials = new Credentials("koeluser06@testpro.io", "te$t$tudent");
        Response response = given()
                .baseUri(baseUrl)
                .basePath(endPoint)
                .header("Content-type", "application/json")
                .body(credentials)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        return "Bearer "+jsonPath.getString("token");
    }
}
