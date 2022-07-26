package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_OmerB;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Repair_StepDef_OmerB {

    RepairPage_OmerB repairPage_omerB =new RepairPage_OmerB();

    @When("User clicks on repairs button ob")
    public void userClicksOnRepairsButtonOb() throws InterruptedException {

        Thread.sleep(3000);
        repairPage_omerB.repairButton.click();
    }

    @Then("User lands on repairs orders page ob")
    public void user_lands_on_repairs_orders_page_ob() throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Repair Orders - Odoo"));

    }
}