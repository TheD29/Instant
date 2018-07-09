package myprojects.automation.assignment5.tests;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import myprojects.automation.assignment5.BaseTest;
import myprojects.automation.assignment5.utils.logging.CustomReporter;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class clienPartAPITEST extends BaseTest {

    static final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZWxlcGhvbmVOdW1iZXIiOiIrMTQzODQ0ODQyMjgiLCJ1c2VySUQiOiI1YjA2N2Y3NGMwMzIwYzExZmM3M2U1NzAiLCJpYXQiOjE1MzExNDEwMzQsImV4cCI6MTUzMTc0NTgzNH0.5KCCyI8GUu1P2ayLkTCqKLaHHiVILiJZ5mVyZoZEWL8";
    Response response;

    @Test(enabled = true)
    public void checkAPISignUP() {
        try {
            response = given()
                    .body("{\"telephoneNumber\": \"+14384484228\"}")
                    .when()
                    .contentType(ContentType.JSON)
                    .post("https://demo.instantcarloanapproval.ca/api/sign-up")
                    .then().assertThat().statusCode(200).extract().response();
            CustomReporter.log(response.asString());
            System.out.println(response.asString());
        } catch (Exception e) {
            CustomReporter.log("Failed sign up api");
        }

    }


    @Test(enabled = true)
    public void checkGetUsrName() {

        Response response = given()
                .header("token", token)
                .body("{\"userName\": \"k Kobein\"}")
                .when()
                .contentType(ContentType.JSON)
                .post("https://demo.instantcarloanapproval.ca/api/get-user-name")
                .then().assertThat().statusCode(200).extract().response();
        CustomReporter.log(response.asString());
    }

    @Test(enabled = true)
    public void getUserNameBirthDayStatus() {
        response = given()
                .header("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZWxlcGhvbmVOdW1iZXIiOiIrMTQzODQ0ODQyMjgiLCJ1c2VySUQiOiI1YjA2N2Y3NGMwMzIwYzExZmM3M2U1NzAiLCJpYXQiOjE1MzExNDEwMzQsImV4cCI6MTUzMTc0NTgzNH0.5KCCyI8GUu1P2ayLkTCqKLaHHiVILiJZ5mVyZoZEWL8")
                .when()
                .body("{\"birthDay\": \"11111988\"}")
                .contentType(ContentType.JSON)
                .post("https://demo.instantcarloanapproval.ca/api/add-birth-day-to-user-model")
                .then().assertThat().statusCode(200).extract().response();
        System.out.println(response.asString());

    }

//                .then().assertThat().statusCode(200);

    @Test(enabled = true)
    public void genderAPI() {
//        given()
//                .header()
//                .when()
//                .body()
//                .post()
//                .then()
//                .statusCode();

    }


    //    @Test(enabled = true)
//    public void getUserNameApi() {
//
//        given()
//                .header("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZWxlcGhvbmVOdW1iZXIiOiIrMTQzODQ0ODQyMjgiLCJ1c2VySUQiOiI1YjA2N2Y3NGMwMzIwYzExZmM3M2U1NzAiLCJpYXQiOjE1MzExNDEwMzQsImV4cCI6MTUzMTc0NTgzNH0.5KCCyI8GUu1P2ayLkTCqKLaHHiVILiJZ5mVyZoZEWL8")
//                .when()
//                .body("{\"userName\": \"k Kobein\"}")
//                .contentType(ContentType.JSON)
//                .post("https://demo.instantcarloanapproval.ca/api/get-user-name")
//    }
}
