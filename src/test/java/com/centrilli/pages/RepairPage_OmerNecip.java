package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairPage_OmerNecip {

    public RepairPage_OmerNecip() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "a[data-menu='535'] span")
    public WebElement RepairsButton;



}
