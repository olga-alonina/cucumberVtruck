package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements( Driver.getDriver(), this );
    }
    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement   all_order;
    @FindBy(xpath = "//button[.='View all products']")
    public WebElement all_product;
    @FindBy (xpath = "//button[.='Order']")
    public WebElement order;
    @FindBy (xpath = "//button[.='Logout']")
    public WebElement logout;

}
