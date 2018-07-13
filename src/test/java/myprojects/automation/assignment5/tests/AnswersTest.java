package myprojects.automation.assignment5.tests;

import myprojects.automation.assignment5.BaseTest;
import myprojects.automation.assignment5.utils.Properties;
import org.testng.annotations.Test;

public class AnswersTest extends BaseTest {

    @Test(enabled = true)
    public void checkClientAnswers_icla103() throws InterruptedException {
        driver.get(Properties.getBaseUrl());
        actions.getCarList();
        actions.getBudgetList();
        actions.useFor();
        actions.setPhoneNumber();
        actions.WeatherMessageBody();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        if (url.equals("https://demo.instantcarloanapproval.ca/returned")) {
            actions.checkUser();
            actions.getCarList();
            actions.getBudgetList();
            actions.useFor();
            actions.setPhoneNumber();
            actions.WeatherMessageBody();
        } else if (url.equals("https://demo.instantcarloanapproval.ca/profilecars")) {
            actions.profileDeleting();
            actions.getCarList();
            actions.getBudgetList();
            actions.useFor();
            actions.setPhoneNumber();
            actions.WeatherMessageBody();
        }
        actions.setFullName();
        actions.setDayOfBirth();
        /*man or women*/
        actions.setGender();
        /*Work or no*/
        answer.clientIsntWorking();
        actions.setDownPayment();
        actions.getAviableCarList();
        actions.viewCar();
        actions.setDeliveryOptions();
        actions.orderSignatureRecivedPayment();
        actions.setCardParams();
        actions.returnToHomePage();
        actions.openProfile();
        answer.getAnswersWhenClientIsntWork();
        actions.returnToPreviousPage();
        actions.profileDeleting();
    }
}
