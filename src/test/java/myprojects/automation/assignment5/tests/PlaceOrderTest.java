package myprojects.automation.assignment5.tests;

import myprojects.automation.assignment5.BaseTest;
import myprojects.automation.assignment5.utils.Properties;
import myprojects.automation.assignment5.utils.logging.CustomReporter;
import org.testng.annotations.Test;

@Test(enabled = true, priority = 1)
public class PlaceOrderTest extends BaseTest {

    @Test(enabled = true, priority = 0)
    public void chekingUserCreatingAndCarIsOrdered() throws InterruptedException {
        String url = driver.getCurrentUrl();
        if (url.equals("https://demo.instantcarloanapproval.ca/profilecars")) {
            actions.profileDeleting();
            CustomReporter.logAction("User is deleted");
        }
    }

    @Test(enabled = true, priority = 1)
    public void checkSignature_01() throws InterruptedException {
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
            System.out.println("current");
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
        actions.getWorkType();//true no work/ false work
        if (actions.getWorkType() == true) {
            actions.setWorkExpirience();
            actions.setMonthlyIncome();
            actions.setConfirmationMonthlyIncome();
            actions.setUploadLaterLink();
            actions.setDownPayment();
            actions.getAviableCarList();
            actions.viewCar();
            actions.setDeliveryOptions();
            actions.orderSignature();
        }
    }

    @Test(enabled = true, priority = 2)

    public void checkRecivedPayment_icla101() throws InterruptedException {
        actions.orderSignatureRecivedPayment();
        actions.setCardParams();
        actions.recivedPayment();
    }

    @Test(enabled = true, priority = 3)
    public void checkPriceAfterReturn_icla102() throws InterruptedException {
        Thread.sleep(1000);
        actions.returnToHomePage();
        Thread.sleep(500);
        actions.recivedPayment();
//        actions.profileDeleting();
    }

    @Test(enabled = true, priority = 4)
    public void checkLeasePMTOnSelectDeliveryPage_icla100() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(500);
        actions.returnToPreviousPage();
        actions.checkLeasePMTOnSelectDeliveryOptions();
    }

    @Test(enabled = true, priority = 5)
    public void check_icla99() throws InterruptedException {

        Thread.sleep(500);
        actions.returnToPreviousPage();
        actions.checkLeaseRateOnCarPtifilePage();

    }

    @Test(enabled = true, priority = 6)
    public void deleteUser() throws InterruptedException {
        Thread.sleep(500);
        actions.returnToPreviousPage();
        Thread.sleep(500);
        actions.returnToPreviousPage();
        Thread.sleep(500);
        actions.profileDeleting();
    }
}
