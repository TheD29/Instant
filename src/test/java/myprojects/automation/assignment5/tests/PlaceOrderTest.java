package myprojects.automation.assignment5.tests;

import myprojects.automation.assignment5.BaseTest;
import myprojects.automation.assignment5.utils.Properties;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseTest {


    @Test(enabled = true, priority = 1)
    public void checkSignature() throws InterruptedException {
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
            actions.setNoConfirmationMonthlyIncome();
            actions.setUploadLaterLink();
            actions.setDownPayment();
            actions.getAviableCarList();
            actions.viewCar();
            actions.setDeliveryOptions();
            actions.orderSignature();
        }
    }

    @Test(enabled = true, priority = 2)
    public void checkLeasePMTOnSelectDeliveryPage_icla100() {
        actions.returnToPreviousPage();
        actions.checkLeasePMTOnSelectDeliveryOptions();
    }

    @Test(enabled = true, priority = 3)
    public void check_icla99() {
        actions.returnToPreviousPage();
        actions.checkLeaseRateOnCarPtifilePage();
    }

    @Test(enabled = true, priority = 4)
    public void checkRecivedPayment_icla101() throws InterruptedException {
        driver.get(Properties.getBaseUrl());
        actions.returnToHome();
        actions.getCarList();
        actions.getBudgetList();
        actions.useFor();
//        actions.setPhoneNumber();
//        actions.WeatherMessageBody();
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
            actions.setNoConfirmationMonthlyIncome();
            actions.setUploadLaterLink();
            actions.setDownPayment();
            actions.getAviableCarList();
            actions.viewCar();
            actions.setDeliveryOptions();
            actions.orderSignatureRecivedPayment();
            actions.setCardParams();
            actions.recivedPayment();
        }
    }

    @Test(enabled = true, priority = 5)
    public void checkVehiclePriceAfterReturn_icla102() throws InterruptedException {
        Thread.sleep(1000);
        actions.returnToHomePage();
        String profileCars = driver.getCurrentUrl();
        if (profileCars.equals("https://demo.instantcarloanapproval.ca/profilecars")) {
            actions.recivedPayment();
        }
        actions.profileDeleting();

    }

    @Test(enabled = false)
    public void checkSignatureRecive() throws InterruptedException {
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
            actions.setNoConfirmationMonthlyIncome();
            actions.setUploadLaterLink();
            actions.setDownPayment();
            actions.getAviableCarList();
            actions.viewCar();
            actions.setDeliveryOptions();
            actions.orderSignatureRecivedPayment();
            actions.setCardParams();
            actions.recivedPayment();
        }


    }

    @DataProvider(name = "documentUpload")
    public static Object[][] upload() {
        return new Object[][]{{"phoneNumbers.txt"}};
    }

    @Test(enabled = false, dataProvider = "documentUpload")
    public void checkFileUpload_valid(String fileName) throws InterruptedException {
        driver.get(Properties.getBaseUrl());
        actions.getCarList();
        actions.getBudgetList();
        actions.useFor();
        actions.setPhoneNumber();
        actions.WeatherMessageBody();
        actions.setFullName();
        actions.setDayOfBirth();
        /*man or women*/
        actions.setGender();
        /*Work or no*/
        actions.getWorkType();//true no work/ false work
        if (actions.getWorkType() == true) {
            actions.setWorkExpirience();
            actions.setMonthlyIncome();
            actions.setNoConfirmationMonthlyIncome();
            fileUpload.getUploadLinkList(fileName);
        }
    }

}
