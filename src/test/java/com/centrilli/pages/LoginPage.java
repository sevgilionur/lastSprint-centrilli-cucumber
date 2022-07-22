package com.centrilli.pages;

import org.openqa.selenium.Keys;

public class LoginPage extends BasePage{

    public void enterCredentials(String email, String password) {
        this.email.sendKeys(Keys.DELETE+email);
        this.password.sendKeys(Keys.BACK_SPACE+password);
        this.loginButton.click();
    }
}
