package com.bridgelabz;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ReTweeterTest {

    @Test
    public void reTweetTets() {

    Response response = RestAssured.given().auth().oauth(
                    "quXG2dZ0qKygljIpa0Mg2vFtU",
                    "xXMiTW0fiD69fEfR5yD1pl0JQsFvq6VVfMb9lUSrJ6zrZTzdOw",
                    "4003503614-Kewo5cPjq0SokbPrjpd8E7vq5p6Q2t4CY2OnjCp",
                    "WnRlWOtPshGMvJMVtNbZZDi73T1AgtX1kGvbtZnj25Q86").
            post("https://api.twitter.com/1.1/statuses/retweet/1650336167735488512.json");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response Body: " + response.asPrettyString());
}
}
