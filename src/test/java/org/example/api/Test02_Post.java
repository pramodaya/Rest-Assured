package org.example.api;

import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Test02_Post {

    @Test
    public void test2() {

        JSONObject request = new JSONObject();
        request.put("name", "chaya");
        request.put("job", "BA");

        System.out.println(request);
        System.out.println(request.toString());

        given().
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().statusCode(201 );

    }

}

