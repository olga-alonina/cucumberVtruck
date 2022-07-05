package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia {
    public Wikipedia() {
        Driver.getDriver().get( "https://www.wikipedia.org/" );
        PageFactory.initElements( Driver.getDriver(), this );
    }
    @FindBy(id="searchInput")
    public WebElement search_Input;
    @FindBy(css = "i[class='sprite svg-search-icon']")
    public WebElement search_bt;
    @FindBy(id="firstHeading")
    public WebElement main_header;
    @FindBy(css = "div[class='fn']")
    public WebElement image_header;
   /* @FindBy
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
