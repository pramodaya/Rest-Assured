package org.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.testng.Assert.*;

public class Test01_Get {


    @Test
    public void test1() {

        Response response = RestAssured.given().get("https://reqres.in/api/users?page=2");
        response
                .then()
                .statusCode(200)
                .body("data.id[0]", equalTo(7));

        assertEquals(response.statusCode(), 200);
        

    }
}
