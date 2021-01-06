package apiPetstore_1;

import helper_1.TestDataGenerator_1;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models_1.Pet_1;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStore_1 {
    private long id;
    private Pet_1 pet;
    @BeforeMethod
    public void startUp(){
        String baseUrl = "https://petstore.swagger.io/v2";
        String endPoint = "/pet";
        pet = TestDataGenerator_1.getPet();

        Response response = given()
                .baseUri(baseUrl)
                .basePath(endPoint)
                .header("Content-type","application/json")
                .body(pet)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        id = jsonPath.getLong("id");
        System.out.println(id);
    }
    @Test
    public void getPetById_PetReturned(){
        String baseUrl = "https://petstore.swagger.io/v2";
        String endPoint = "/pet/"+id;

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
        Pet_1 petResponse = jsonPath.getObject("$",Pet_1.class);

        Assert.assertEquals(petResponse.getStatus(),pet.getStatus());
        Assert.assertEquals(petResponse.getCategory().getName(),pet.getCategory().getName());
        Assert.assertEquals(petResponse.getCategory().getId(),pet.getCategory().getId());
        Assert.assertEquals(petResponse.getName(),pet.getName());
        var xx= petResponse.getPhotoUrl().length;
        System.out.println(petResponse.getPhotoUrl().length);
//        Assert.assertEquals(petResponse.getPhotoUrl()[0],pet.getPhotoUrl()[0]);
    }
}
