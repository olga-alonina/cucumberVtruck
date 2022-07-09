package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTable {
    public WebTable() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name="password")
    public WebElement password;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement login_bt;
    public void login(String login1, String password1){
      username.sendKeys( login1 );
        password.sendKeys( password1 );
        login_bt.click();
    }


}