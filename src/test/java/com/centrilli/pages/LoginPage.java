package com.centrilli.pages;

public class LoginPage extends BasePage{

    public void enterCredentials(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.loginButton.click();
    }
}
