package myprojects.automation.assignment5.tests;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import myprojects.automation.assignment5.BaseTest;
import myprojects.automation.assignment5.utils.logging.CustomReporter;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class clienPartAPITEST extends BaseTest {

    @Test(enabled = true)
    public void checkAPISignUP() {
        try {
            given()
                    .body("{\"telephoneNumber\": \"+14384484228\"}")
                    .when()
                    .contentType(ContentType.JSON)
                    .post("https://demo.instantcarloanapproval.ca/api/sign-up")
                    .then().statusCode(200);
        } catch (Exception e) {
            CustomReporter.log("Failed sign up api");
        }

    }

    @Test(enabled = true)
    public void getUserNameApi() {

        given().header("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZWxlcGhvbmVOdW1iZXIiOiIrMTQzODQ0ODQyMjgiLCJ1c2VySUQiOiI1YjA2N2Y3NGMwMzIwYzExZmM3M2U1NzAiLCJpYXQiOjE1MzExNDEwMzQsImV4cCI6MTUzMTc0NTgzNH0.5KCCyI8GUu1P2ayLkTCqKLaHHiVILiJZ5mVyZoZEWL8")
                .body("{\"userName\": \"k Kobein\"}")
                .when()
                .contentType(ContentType.JSON)
                .post("https://demo.instantcarloanapproval.ca/api/sign-up")
                .then().statusCode(200);
    }

    @Test(enabled = false)
    public void checkSignUpAPI() {

        Response response = given()
                .body("{\"telephoneNumber\": \"+14384484228\"}")
                .when()
                .contentType(ContentType.JSON)
                .post("https://demo.instantcarloanapproval.ca/api/sign-up");
        System.out.println(response.asString());

    }

}
