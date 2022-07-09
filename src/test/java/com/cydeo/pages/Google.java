package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
    public Google() {
        PageFactory.initElements( Driver.getDriver(), this );
    }
    @FindBy(name="q")
    public WebElement search_window;

    @FindBy(css = "a[class='FLP8od']")
    public WebElement capitalText;

    /*@FindBy()
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
