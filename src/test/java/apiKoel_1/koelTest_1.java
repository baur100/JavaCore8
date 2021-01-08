package apiKoel_1;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class koelTest_1 {
    @Test
    public void getPetById_PetReturned(){
        String baseUrl = "https://koelapp.testpro.io/";
        String endPoint = "api/me;

        Response response = given()
                .baseUri(baseUrl)
                .basePath(endPoint)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$",Pet.class);
}
