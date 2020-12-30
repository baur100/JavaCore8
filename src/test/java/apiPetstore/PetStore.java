package apiPetstore;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStore {
    @Test
    public void getPetById_PetReturned(){
        String baseUrl = "http://petstore.swagger.io/v2";
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
