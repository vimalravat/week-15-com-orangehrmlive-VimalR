package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.ForgotPassword;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {


    ForgotPassword forgotPassword;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPassword = new ForgotPassword();
    }


    @Test(groups = {"smoke","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPassword.forgotPasswordLink();

        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPassword.resetPasswordMessage(),expectedMessage,"no message displayed");



    }

}
