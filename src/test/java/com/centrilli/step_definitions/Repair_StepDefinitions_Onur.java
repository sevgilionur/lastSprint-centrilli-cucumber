package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_Onur;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Repair_StepDefinitions_Onur {

    RepairPage_Onur repairPage_onur = new RepairPage_Onur();

    @When("User clicks on repairs button onur")
    public void user_clicks_on_repairs_button_onur() throws InterruptedException {
        Thread.sleep(3000);
        repairPage_onur.repairButton.click();

    }
    @Then("User lands on repairs orders page onur")
    public void user_lands_on_repairs_orders_page_onur() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Repair Orders - Odoo"));
    }
}
