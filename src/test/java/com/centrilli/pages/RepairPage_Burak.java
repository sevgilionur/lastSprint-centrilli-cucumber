package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairPage_Burak {

    public RepairPage_Burak() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@data-menu-xmlid='mrp_repair.menu_repair_order']/*[@class='oe_menu_text']")
    public WebElement repairButton;



}


