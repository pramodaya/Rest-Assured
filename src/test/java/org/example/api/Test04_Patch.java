package org.example.api;

import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Test04_Patch {

    @Test
    public void test1() {

        JSONObject request = new JSONObject();
        request.put("name", "chaya");
        request.put("job", "BAA");

        System.out.println(request);
        System.out.println(request.toString());

        given().
                body(request.toJSONString()).
                when().
                patch("https://reqres.in/api/users").
                then().statusCode(200);

    }

}
