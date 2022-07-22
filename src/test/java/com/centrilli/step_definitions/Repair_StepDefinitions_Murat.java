package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_Murat;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Repair_StepDefinitions_Murat {

    RepairPage_Murat repairPage_murat=new RepairPage_Murat();

    @When("User clicks on repairs button_murat")
    public void user_clicks_on_repairs_button_murat() throws InterruptedException {
        Thread.sleep(3000);
       repairPage_murat.repairButton.click();
        System.out.println("click on repair button");

    }
    @Then("User sees Repair Order Page_murat")
    public void user_sees_repair_order_page_murat() throws InterruptedException {
       Thread.sleep(3000);
        Assert.assertEquals("Repair Orders - Odoo", Driver.getDriver().getTitle());
    }
}
