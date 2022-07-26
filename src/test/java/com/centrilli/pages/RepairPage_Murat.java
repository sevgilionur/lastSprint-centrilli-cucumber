package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairPage_Murat extends BasePage {

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

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement repairOrdersEditButton;

    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input o_required_modifier']")
    public WebElement productQuantityInputBox;

    @FindBy(xpath = "//span[@name='product_qty']")
    public WebElement productQuantityDisplayBox;

    @FindBy(xpath = "//label[@for='o_field_input_175']")
    public WebElement productQuantityButton;

    @FindBy(xpath = "//button[@class=\'btn btn-primary btn-sm o_form_button_save\']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement repairReferenceBox;

    @FindBy(xpath = "//button[normalize-space(text()) = 'Create']")
    public WebElement createButton2;







}
