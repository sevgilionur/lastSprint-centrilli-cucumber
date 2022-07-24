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
        //Thread.sleep(3000);
        // Assert.assertEquals("Repair Orders - Odoo", Driver.getDriver().getTitle());
        Utilities.waitFor(5);
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith("Repair Orders"));
    }
    @When("User clicks existing {string} order_murat")
    public void userClicksExistingOrder_murat(String productNumber) {
        Utilities.waitForClickablility(repairPage_murat.getProductWebElement(productNumber),3);
        repairPage_murat.getProductWebElement(productNumber).click();
    }


    @Then("User can access the existing {string} Repair Orders_murat")
    public void userCanAccessTheExistingRepairOrders_murat(String productNumber) throws InterruptedException {
       // Thread.sleep(3000);
        Utilities.waitFor(5);
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith("RMA/"+productNumber));
    }


    @When("User clicks Repair Orders Edit Button_murat")
    public void user_clicks_repair_orders_edit_button_murat() {
        Utilities.waitForClickablility(repairPage_murat.repairOrdersEditButton,10);
       repairPage_murat.repairOrdersEditButton.click();
    }
    @When("User inputs  {string} to Product Quantity Box_murat")
    public void user_inputs_to_product_quantity_box_murat(String newQuantity) {
        Utilities.waitFor(5);
        repairPage_murat.productQuantityInputBox.clear();
        repairPage_murat.productQuantityInputBox.sendKeys(newQuantity);

    }
    @When("User clicks Save Button_murat")
    public void user_clicks_save_button_murat() {
        Utilities.waitForClickablility(repairPage_murat.saveButton,10);
        repairPage_murat.saveButton.click();

    }
    @Then("Verify that order has been changed to new {string} successfully_murat")
    public void verify_that_order_has_been_changed_to_new_successfully_murat(String newQuantity) {
        //Utilities.waitFor(3);
        Utilities.waitForVisibility(repairPage_murat.productQuantityDisplayBox,10);
        String expectedQuantity=newQuantity+".000";
        Utilities.waitForVisibility(repairPage_murat.productQuantityDisplayBox,10);
        Assert.assertEquals(expectedQuantity,repairPage_murat.productQuantityDisplayBox.getText());

    }




}
