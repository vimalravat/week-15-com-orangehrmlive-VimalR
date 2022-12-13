package com.orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends Utility {
    @CacheLookup
    @FindBy(xpath = "//p[contains(@class,'-forgot-header')]")
    WebElement forgotPasswordButton;
    @CacheLookup
    @FindBy(xpath = "//h6[contains(@class,'forgot-password-title')]")
    WebElement resetPasswordText;

    public void forgotPasswordLink(){
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + forgotPasswordButton);
        clickOnElement(forgotPasswordButton);

    }
    public String resetPasswordMessage(){
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + resetPasswordText);
        return getTextFromElement(resetPasswordText);

    }
}




