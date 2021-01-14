package apiPetstoreNK;

import helper.TestDataGenerator;
import homework24.TestDataGeneratorNK;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import modelsNK.PetNK;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;


public class PetStoreNK {
    private long id;
    private PetNK pet;
    @BeforeMethod
    public void startUp(){
        String baseUrl = "https://petstore.swagger.io/v2";
        String endPoint = "/pet";
        pet = TestDataGeneratorNK.getPet();

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
        PetNK petResponse = jsonPath.getObject("$",PetNK.class);

        Assert.assertEquals(petResponse.getStatus(),pet.getStatus());
        Assert.assertEquals(petResponse.getCategory().getName(),pet.getCategory().getName());
        Assert.assertEquals(petResponse.getCategory().getId(),pet.getCategory().getId());
//        Assert.assertEquals(petResponse.getName(),pet.getName());
//        var xx= petResponse.getPhotoUrl().length;
//        System.out.println(petResponse.getPhotoUrl().length);
        //        Assert.assertEquals(petResponse.getPhotoUrl()[0],pet.getPhotoUrl()[0]);
    }
}
