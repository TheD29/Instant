package myprojects.automation.assignment5.tests;

import myprojects.automation.assignment5.BaseTest;
import org.testng.annotations.Test;

public class ClientPartAPITest extends BaseTest {


    @Test(enabled = true)
    public void checkAPISignUP() {
        api.postSignUP();
    }

    @Test(enabled = true)
    public void checkActivationCode() {

    }

    @Test(enabled = true)
    public void checkGetUsrName() {
        api.postUsrName();
    }

    @Test(enabled = true)
    public void checkUserNameBirthDayStatus() {
        api.postUserNameBirthDay();
    }

    @Test(enabled = true)
    public void checkGender() {
        api.postGenderAPIRes();
    }

    @Test(enabled = true)
    public void checkWorkingStatus() {
        api.postWorkingStatus();
    }

    @Test(enabled = true)
    public void checkWorkExpirience() {
        api.postWorkExpirience();
    }

    @Test(enabled = true)
    public void selectMonthlyIncome() {
        api.postSelectMonthlyIncome();
    }

    @Test(enabled = true)
    public void monthlyIncomeConfirm() {
        api.postMonthlyIncomeConfirm();

    }

    @Test(enabled = true)
    public void fileUpload() {
        api.postFileUpload();
    }

    @Test(enabled = true)
    public void getApprovedCarList() {
        api.getApprovedCarListInfo();
    }

    @Test(enabled = true)
    public void getSignatureAccept() {
        api.postSignatureAccept();
    }

    @Test(enabled = true)
    public void setPaymentParams() {
        api.postCardPaymentParams();
    }

    @Test(enabled = true)
    public void userDelete() {
        api.postUserDelete();
    }

    //Todo performance tests

    @Test(enabled = true)
    public void performanceSignUp() {
        api.performanceSignUp();
    }

    @Test(enabled = true)
    public void performanceApprovedCarList() {
        api.performanceApproveCarList();
    }


}


