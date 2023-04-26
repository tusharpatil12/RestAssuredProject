package com.bridgelabz;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCallTest {

//       @Test
//    public void getPetTest() {
//        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/100");
//        System.out.println("Status code: " + response.statusCode());
//        Assert.assertEquals(response.statusCode(), 200);
//        System.out.println("Time: " + response.getTime());
//        System.out.println("Json Body: " + response.asPrettyString());
//        System.out.println("Json Body: "+response.asString());
//        JsonPath jsonPath =  response.getBody().jsonPath();
//
//        System.out.println("Pet tags name: "+jsonPath.get("tags.name").toString());
//
//
//    }
    @Test
    public void getPetTest() {
        Response response = RestAssured.get("http://localhost:3000/posts");
        System.out.println("Status code: " + response.statusCode());
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println("Time: " + response.getTime());
        System.out.println(response.getBody().asPrettyString());
        System.out.println("Json Body: "+response.asString());
        JsonPath jsonPath =  response.getBody().jsonPath();
        System.out.println("Pet tags name: "+jsonPath.get("tags.name").toString());



    }

}
