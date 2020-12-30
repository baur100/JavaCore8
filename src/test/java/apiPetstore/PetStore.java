package apiPetstore;

import io.restassured.path.json.JsonPath;
<<<<<<< HEAD
import org.openqa.selenium.remote.Response;
=======
import io.restassured.response.Response;
import org.testng.Assert;
>>>>>>> origin/main
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStore {
    @Test
    public void getPetById_PetReturned(){
<<<<<<< HEAD
        String baseUrl = "http://petstore.swagger.io/v2";
=======
        String baseUrl = "https://petstore.swagger.io/v2";
>>>>>>> origin/main
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
<<<<<<< HEAD

=======
>>>>>>> origin/main
    }
}
