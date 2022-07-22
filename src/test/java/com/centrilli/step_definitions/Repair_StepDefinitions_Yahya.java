package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_Yahya;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class Repair_StepDefinitions_Yahya {


    RepairPage_Yahya repairPage_yahya = new RepairPage_Yahya();
    String newQuantity=""+2;


    @When("User clicks on repairs button yahya")
    public void user_clicks_on_repairs_button_yahya() throws InterruptedException {
        Utilities.waitForClickablility(repairPage_yahya.repairButton,3);
        repairPage_yahya.repairButton.click();
    }

    @Then("User lands on repairs orders page yahya")
    public void user_lands_on_repairs_orders_page_yahya() throws InterruptedException {
        Utilities.waitForClickablility(repairPage_yahya.createButtonForProduct,3);
        assertEquals("Repair Orders - Odoo", Driver.getDriver().getTitle());
    }


    @When("User clicks on the product on page")
    public void user_clicks_on_the_product_on_page() {
        //repairPage_yahya.clicktoproduct(product);
        repairPage_yahya.productToEdit.click();
    }

    @When("User clicks on the edit button")
    public void user_clicks_on_the_edit_button() {
       repairPage_yahya.editButtonForProduct.click();
    }

    @When("User changes quantity of the order and save")
    public void user_changes_quantity_of_the_order() {
        repairPage_yahya.productQuantityInput.clear();
        repairPage_yahya.productQuantityInput.sendKeys(newQuantity);
        repairPage_yahya.saveButtonForProduct.click();
    }

    @Then("Verify that order has been edit successfully")
    public void verify_that_order_has_been_edit_successfully() {
        assertTrue(repairPage_yahya.productQuantityInfo.getText().contains(newQuantity));


    }

    @And("User clicks on the {string} on page")
    public void userClicksOnTheOnPage(String product) throws InterruptedException {
        repairPage_yahya.clicktoproduct(product);
        Thread.sleep(3000);
    }
}