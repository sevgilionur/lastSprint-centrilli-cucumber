package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.PropertyReader;
import io.cucumber.java.en.Given;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User goes to application page and enter valid credentials")
    public void user_goes_to_application_page_and_enter_valid_credentials() {
        Driver.getDriver().get(PropertyReader.getProperty("url"));
        loginPage.enterCredentials(PropertyReader.getProperty("email"),
                PropertyReader.getProperty("password"));

    }
}
