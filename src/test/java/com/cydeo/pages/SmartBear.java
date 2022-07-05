package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBear {
    public SmartBear() {
        PageFactory.initElements( Driver.getDriver(), this );
    }
    //credentials:
//Username - Tester
//Password - test

    //login page
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;
    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement login_bt;
    //dashboard page
    @FindBy(xpath = "//a[.='Order']")
    public WebElement order;
    @FindBy(css = "div[class='login_info']")
    public WebElement avatar;

    //order page
    @FindBy(tagName = "h2")
    public WebElement main_header;
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement unit_price;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discount;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement total;
    @FindBy(css = "input[value='Calculate']")
    public WebElement calculate_bt;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customer_name;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip_code;
    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visa;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement card_number;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement date;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement process_bt;
    @FindBy(tagName = "strong")
    public WebElement success_message;
    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList;

    public void login(String login1, String password1){
        username.sendKeys( login1 );
        password.sendKeys( password1 );
        login_bt.click();
    }


}