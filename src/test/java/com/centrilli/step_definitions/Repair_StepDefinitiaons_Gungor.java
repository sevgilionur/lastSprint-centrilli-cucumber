package com.centrilli.step_definitions;

import com.centrilli.pages.RepairPage_Gungor;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Repair_StepDefinitiaons_Gungor {

    RepairPage_Gungor repairPage_gungor = new RepairPage_Gungor();

    @When("user clicks on repairs button gy")
    public void user_clicks_on_repairs_button_gy() {
       repairPage_gungor.repairBtn.click();
    }
    @Then("user lands on repairs orders page gy")
    public void user_lands_on_repairs_orders_page_gy() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Repair Orders - Odoo",Driver.getDriver().getTitle());
    }

    @When("user clicks on exisiting repair order gy")
    public void user_clicks_on_exisiting_repair_order_gy() {
        repairPage_gungor.existingRepair.click();
    }
    @Then("user should see the detailed repair order page gy")
    public void user_should_see_the_detailed_repair_order_page_gy() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("RMA/00423 - Odoo",Driver.getDriver().getTitle());
    }

}
