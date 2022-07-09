package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CRM {
    public CRM() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement user_place;
    @FindBy(name = "USER_PASSWORD")
    public WebElement password_place;
    @FindBy(css = "input[type='submit']")
    public WebElement login_bt;
    @FindBy(xpath = "//span[normalize-space(text())='Calendar']")
    public WebElement calendar;
    @FindBy(xpath = "//li//a[.='Company Calendar']")
    public WebElement comp_calendar;
    @FindBy(css = "span[data-bx-month]")
    public List<WebElement> listOfMonths;
    public void login(String username, String password){
        user_place.sendKeys( username );
        password_place.sendKeys( password );
        login_bt.click();
    }

}
