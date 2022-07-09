package com.library.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {
    public AddUser() {
        Driver.getDriver().get( "https://library1.cydeo.com" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(name = "full_name")
    public WebElement full_name;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(id = "user_group_id")
    public WebElement user_group;
    @FindBy(name = "start_date")
    public WebElement start_date;
    @FindBy(id = "address")
    public WebElement address;
    @FindBy(name = "email")
    public WebElement email;
    @FindBy(id = "status")
    public WebElement status;
/*
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement
    @FindBy
    public WebElement*/

}
