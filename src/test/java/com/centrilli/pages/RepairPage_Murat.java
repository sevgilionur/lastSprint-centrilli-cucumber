package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairPage_Murat {

    public RepairPage_Murat(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[12]/a")
    public WebElement repairButton;

    @FindBy(xpath = "//td[.='RMA/00500']")
    public WebElement productRMA500;

    public WebElement getProductWebElement(String productNumber){

        return Driver.getDriver().findElement(By.xpath("//td[.='RMA/"+productNumber+"']"));
    }

}
