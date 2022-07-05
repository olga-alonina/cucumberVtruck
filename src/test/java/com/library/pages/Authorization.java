package com.library.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authorization {
    public Authorization() {
        Driver.getDriver().get( "https://library1.cydeo.com" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    //Authorization page
    @FindBy(css = "button[type='submit']")
    public WebElement sign_In;
    @FindBy(id = "inputEmail-error")
    public WebElement error_msg;
    @FindBy(css = "label[for='inputEmail']")
    public WebElement email;
    @FindBy(css = "label[for='inputPassword']")
    public WebElement password;
}
