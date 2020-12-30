package apiPetstore_1;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStore_1 {
    @Test
    public void getPetById_PetReturned(){
        String baseUrl = "https://petstore.swagger.io/v2";
        String endPoint = "/pet/555";

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
        System.out.println(jsonPath.prettify());
    }
}
