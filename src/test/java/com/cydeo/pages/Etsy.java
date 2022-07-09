package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Etsy {
    public Etsy() {
        PageFactory.initElements( Driver.getDriver(), this );
    }
    @FindBy(id="global-enhancements-search-query")
    public WebElement search_box;
  @FindBy(css = "button[value='Search']")
    public WebElement search_bt;
    /*@FindBy
    public WebElement
    @FindBy
    public WebElement*/
}
