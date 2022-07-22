package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_Murat;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.Utilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Repair_StepDefinitions_Murat {

    RepairPage_Murat repairPage_murat=new RepairPage_Murat();

    @When("User clicks on repairs button_murat")
    public void user_clicks_on_repairs_button_murat() throws InterruptedException {
        Utilities.waitForClickablility(repairPage_murat.repairButton,3);
       repairPage_murat.repairButton.click();
        System.out.println("click on repair button");

    }
    @Then("User sees Repair Order Page_murat")
    public void user_sees_repair_order_page_murat() throws InterruptedException {
      Thread.sleep(3000);
        // Assert.assertEquals("Repair Orders - Odoo", Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith("Repair Orders"));
    }
    @When("User clicks existing {string} order_murat")
    public void userClicksExistingOrder_murat(String productNumber) {
        Utilities.waitForClickablility(repairPage_murat.getProductWebElement(productNumber),3);
        repairPage_murat.getProductWebElement(productNumber).click();
    }


    @Then("User can access the existing {string} Repair Orders_murat")
    public void userCanAccessTheExistingRepairOrders_murat(String productNumber) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith("RMA/"+productNumber));
    }




}
