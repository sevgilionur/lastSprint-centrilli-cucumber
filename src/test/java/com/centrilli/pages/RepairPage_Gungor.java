package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairPage_Gungor {

    public RepairPage_Gungor() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[12]")
    public WebElement repairBtn;

    @FindBy(xpath = "//td[.='RMA/00423']")
    public WebElement existingRepair;


}
