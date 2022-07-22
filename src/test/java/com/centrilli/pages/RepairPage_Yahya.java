package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairPage_Yahya {
    public RepairPage_Yahya() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    String str = "asdsa";
    @FindBy(xpath = "//*[.='RMA/00403']")
    public WebElement productToEdit;

    public void clicktoproduct(String product) {
        String searchProduct = product;
        String xpath = "//*[.='" + searchProduct + "']";
        Driver.getDriver().findElement(By.xpath(xpath)).click();

    }


    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[12]/a")
    public WebElement repairButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButtonForProduct;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement productNameInput;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButtonForProduct;

    @FindBy(xpath = "//input[@name='product_qty']")
    public WebElement productQuantityInput;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButtonForProduct;

    @FindBy(xpath = "//span[@name='product_qty']")
    public WebElement productQuantityInfo;


}
