package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_Onur;
import com.centrilli.pages.RepairPage_Yahya;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.Utilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;

import static org.junit.Assert.*;

public class Repair_StepDefinitions_Yahya extends RepairPage_Yahya {



    RepairPage_Yahya repairPage_yahya = new RepairPage_Yahya();




    @When("User clicks on repairs button yahya")
    public void user_clicks_on_repairs_button_yahya() {
        Utilities.waitForClickablility(repairPage_yahya.repairButton,3);
        repairPage_yahya.repairButton.click();
    }

    @Then("User lands on repairs orders page yahya")
    public void user_lands_on_repairs_orders_page_yahya() {
        Utilities.waitForClickablility(repairPage_yahya.createButtonForProduct,3);
        assertEquals("Repair Orders - Odoo", Driver.getDriver().getTitle());
    }


    @When("User clicks on the product on page")
    public void user_clicks_on_the_product_on_page() {
        repairPage_yahya.clickOnTargetOrder("RMA/00699");
    }

    @When("User clicks on the edit button")
    public void user_clicks_on_the_edit_button() {
       repairPage_yahya.editButtonForProduct.click();
    }

    @When("User changes quantity of the order and save")
    public void user_changes_quantity_of_the_order() {
       repairPage_yahya.changeQuantity();

    }

    @Then("Verify that order has been edit successfully")
    public void verify_that_order_has_been_edit_successfully() {
        repairPage_yahya.orderEditverification();

    }

    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        Utilities.waitForClickablility(repairPage_yahya.createButtonForProduct,3);
        repairPage_yahya.createButtonForProduct.click();
    }

    @When("User fills repair reference modules fields and click on save button")
    public void user_fills_repair_reference_modules_fields_and_click_on_save_button() {
        repairPage_yahya.createOrder();
    }



    @Then("Verify that order is listed")
    public void verify_that_order_is_listed() {

    }

    @Then("Verify that repair order is created")
    public void verify_that_repair_order_is_created() {
        repairPage_yahya.verificationOrderCreated();

    }

}