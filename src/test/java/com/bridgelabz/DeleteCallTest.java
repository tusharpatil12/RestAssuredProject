package com.bridgelabz;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteCallTest {

    @Test
    public void deleteDetails() {

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        Response response = RestAssured.delete("");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        Assert.assertEquals(response.statusCode(), 200);
    }


}
