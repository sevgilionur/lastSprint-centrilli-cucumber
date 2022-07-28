package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import com.centrilli.utilities.Utilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

import static org.junit.Assert.assertTrue;

public class RepairPage_Yahya {

    String newQuantity=""+2;


    public RepairPage_Yahya(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='RMA/00403']")
    public WebElement productToEdit;

    @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']")
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
    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement productTorepairDDbutton;

    @FindBy(xpath = "//li[contains(.,'[2875] test')]")
    public WebElement productTorepair1;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement customerDDbutton;

    @FindBy(xpath = "//li[contains(., 'AAAA VA')]")
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

    @FindBy(xpath = "(//li[contains(.,'[#440809]')])[2]")
    public WebElement selectProductDown;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement referenceInput;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchInput;

    @FindBy(xpath = "//td[.='RMA/00674']")
    public WebElement orderAfterSearch;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement createdOrderReference;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[11]")
    public WebElement productDDButtonDown;

    @FindBy(xpath = "//span[@name='amount_total']")
    public WebElement totalAmount;







    public void createOrder() {
        this.productTorepairDDbutton.click();
        this.productTorepair1.click();
        this.saveButton.click();
        Utilities.waitForClickablility(this.createButtonForProduct,3);
    }

    public void changeQuantity() {

        this.productQuantityInput.clear();
        this.productQuantityInput.sendKeys(newQuantity);
        this.saveButtonForProduct.click();
    }

    public void orderEditverification() {
        assertTrue(this.productQuantityInfo.getText().contains(newQuantity));
    }

    public void clickOnTargetOrder(String productName) {
        Driver.getDriver().findElement(By.xpath("//*[.='"+productName+"']")).click();
    }


    public void verificationOrderCreated() {
        //1- Store the created order in a local variable

        String repairReference= Driver.getDriver()
                .findElement(By.
                        xpath("//span[@class='o_field_char o_field_widget o_required_modifier']"))
                .getText();

        //2- Click on repair button to reach search field
        Utilities.waitForClickablility(repairButton,3);
        repairButton.click();

        //3- Search for the created order
        Utilities.waitForClickablility(searchInput,3);
        searchInput.sendKeys(repairReference+Keys.ENTER);

        //4- Verify the order is listed by finding WebElement
        Assert.assertTrue(Driver.getDriver()
                .findElement(By.xpath
                                ("//td[.='"+repairReference+"']"))
                .isDisplayed());
    }

    public void fillTheRepairReference() {
        productTorepairDDbutton.click();
        productTorepair1.click();

        customerDDbutton.click();
        customer.click();
        addAnItemButton.click();
        typeDDbutton.click();
        addbutton.click();
        productDDButtonDown.click();

        selectProductDown.click();

        invonceMethodDDbutton.click();
        invonceAfterRepair.click();








    }
}
