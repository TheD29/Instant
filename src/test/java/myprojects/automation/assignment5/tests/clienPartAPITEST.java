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
