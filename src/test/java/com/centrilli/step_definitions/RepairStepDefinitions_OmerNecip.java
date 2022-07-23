package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_OmerNecip;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RepairStepDefinitions_OmerNecip {

   RepairPage_OmerNecip repairPage_omerNecip=new RepairPage_OmerNecip();

    @When("User clicks on repairs button Necip")
    public void user_clicks_on_repairs_button_necip() throws InterruptedException {
        Thread.sleep(3000);
       repairPage_omerNecip.RepairsButton.click();

    }
    @Then("User lands on repairs orders page Necip")
    public void user_lands_on_repairs_orders_page_necip() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Repair Orders - Odoo"));
    }
}
