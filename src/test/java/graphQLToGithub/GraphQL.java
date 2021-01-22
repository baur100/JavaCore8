package graphQLToGithub;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GraphQL {
    @Test
    public void getUser(){
        String token = "Bearer 3098468b8f479fffe5147846492c76e6bb459b94";
        String body = "{\"query\":\"query($username:String!){\\r\\n    user(login:$username){\\r\\n        name,\\r\\n        location,\\r\\n        url\\r\\n    }\\r\\n}\",\"variables\":{\"username\":\"baur100\"}}";
        Response response =
                given()
                        .baseUri("https://api.github.com")
                        .basePath("/graphql")
                        .header("Content-Type","application/json")
                        .header("Authorization", token)
                        .body(body)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.prettify());
    }
}
