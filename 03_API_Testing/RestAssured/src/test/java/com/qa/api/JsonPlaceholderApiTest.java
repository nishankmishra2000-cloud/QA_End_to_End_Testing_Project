package com.qa.api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class JsonPlaceholderApiTest {
    private final String base = "https://jsonplaceholder.typicode.com";
    @Test public void getPost(){given().baseUri(base).when().get("/posts/1").then().statusCode(200).contentType(containsString("application/json")).body("id", equalTo(1));}
    @Test public void createPost(){given().baseUri(base).header("Content-Type","application/json").body("{\"title\":\"QA\",\"body\":\"Automation\",\"userId\":1}").when().post("/posts").then().statusCode(201).body("title", equalTo("QA"));}
    @Test public void updatePost(){given().baseUri(base).header("Content-Type","application/json").body("{\"id\":1,\"title\":\"Updated\",\"body\":\"QA\",\"userId\":1}").when().put("/posts/1").then().statusCode(200).body("title", equalTo("Updated"));}
    @Test public void patchPost(){given().baseUri(base).header("Content-Type","application/json").body("{\"title\":\"Patched\"}").when().patch("/posts/1").then().statusCode(200).body("title", equalTo("Patched"));}
    @Test public void deletePost(){given().baseUri(base).when().delete("/posts/1").then().statusCode(200);}
}
