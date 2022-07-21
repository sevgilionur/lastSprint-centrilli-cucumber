package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_Burak;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.swing.*;

public class Repair_StepDefinitions_Burak {

    RepairPage_Burak repairPage_burak = new RepairPage_Burak();
    @When("User clicks on repairs button burak")
    public void user_clicks_on_repairs_button_burak() throws InterruptedException {
        Thread.sleep(2000);
    repairPage_burak.repairButton.click();
    }
    @Then("User lands on repairs orders page burak")
    public void user_lands_on_repairs_orders_page_burak() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Repair"));
    }



}
