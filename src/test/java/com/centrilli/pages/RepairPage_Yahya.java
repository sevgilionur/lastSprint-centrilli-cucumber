package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairPage_Yahya {
    public RepairPage_Yahya(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='RMA/00403']")
    public WebElement productToEdit;

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

    /** REPAIR REFERENCE PAGES ELEMENTS BELOW
     **/
    @FindBy(xpath = "//input[@id='o_field_input_2354']")
    public WebElement productTorepairDDbutton;

    @FindBy(xpath = "//li[contains(.,'[2875] test')]")
    public WebElement ProductTorepair1;

    @FindBy(xpath = "//input[@id='o_field_input_2358']")
    public WebElement customerDDbutton;

    @FindBy(xpath = "//li[contains(., 'vmnzrz')]")
    public WebElement customer;

    @FindBy(xpath = "//select[@name='invoice_method']")
    public WebElement invonceMethodDDbutton;

    @FindBy(xpath = "//option[contains(@value, 'after_repair')]")
    public WebElement invonceAfterRepair;

    @FindBy(xpath = "//a[.='Add an item']")
    public WebElement addAnItemButton;

    @FindBy(xpath = "(//select[@class='o_input o_field_widget o_required_modifier'])[2]")
    public WebElement typeDDbutton;

    @FindBy(xpath = "//option[.='Add']")
    public WebElement addbutton;

    @FindBy(xpath = "//li[contains(., '[#440809]')]")
    public WebElement productDDbutton;








}
