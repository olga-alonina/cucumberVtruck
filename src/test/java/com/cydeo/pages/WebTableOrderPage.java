package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage {
    public WebTableOrderPage() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(name = "product")
    public WebElement product;
    @FindBy(name = "quantity")
    public WebElement quantity;
    @FindBy(name = "name")
    public WebElement customer_name;
    @FindBy(name = "street")
    public WebElement street;
    @FindBy(name = "city")
    public WebElement city;
    @FindBy(name = "state")
    public WebElement state;
    @FindBy(name = "zip")
    public WebElement zip_code;


    @FindBy(name="card")
    public List<WebElement> cardName;
    @FindBy(name = "cardNo")
    public WebElement card_number;
    @FindBy(name = "cardExp")
    public WebElement exper_date;
    @FindBy(css = "button[type='submit']")
    public WebElement process_order;







}
