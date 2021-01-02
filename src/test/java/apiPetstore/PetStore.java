package apiPetstore;

import helper.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStore {
    private long id;
    private Pet pet;
    @BeforeMethod
    public void startUp(){
        String baseUrl = "https://petstore.swagger.io/v2";
        String endPoint = "/pet";
        pet = TestDataGenerator.getPet();

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
        Pet petResponse = jsonPath.getObject("$",Pet.class);

        Assert.assertEquals(petResponse.getStatus(),pet.getStatus());
        Assert.assertEquals(petResponse.getCategory().getName(),pet.getCategory().getName());
        Assert.assertEquals(petResponse.getCategory().getId(),pet.getCategory().getId());
        Assert.assertEquals(petResponse.getName(),pet.getName());
        var xx= petResponse.getPhotoUrl().length;
        System.out.println(petResponse.getPhotoUrl().length);
//        Assert.assertEquals(petResponse.getPhotoUrl()[0],pet.getPhotoUrl()[0]);
    }
}
