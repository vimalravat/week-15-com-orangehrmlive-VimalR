package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }



    @Test (groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {

            loginPage.usernameField("Admin");
            loginPage.passwordField("admin123");
            loginPage.clickToLoginButton();
            String expectedMessage = "Dashboard";
            Assert.assertEquals(loginPage.MessageOccur(),expectedMessage,"Message not Displayed");


        }

}
