package com.bridgelabz;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostCallTest {

    @Test
    public void addPetTest() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        Response response = request.post("https://petstore.swagger.io/v2/pet");
        System.out.println("status code:" + response.getStatusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Json Body:" + response.asPrettyString());

        //Assert.assertEquals(response.statusCode(), 200);

    }

}
