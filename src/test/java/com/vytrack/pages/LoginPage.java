package com.vytrack.pages;

import com.vytrack.utilities.utility_driver.ConfigurationReader;
import com.vytrack.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        Driver.getDriver().get( ConfigurationReader.getProperty( "url" ) );
        PageFactory.initElements( Driver.getDriver(),this);
    }

    @FindBy(id="prependedInput")
    public WebElement username;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(id="_submit")
    public WebElement login;

}