package org.example.api;

import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Test05_Delete {

    @Test
    public void test3() {

        JSONObject request = new JSONObject();
        given().
                body(request.toJSONString()).
                when().
                delete("https://reqres.in/api/users/2").
                then().statusCode(204).
                log().all();

    }

}
