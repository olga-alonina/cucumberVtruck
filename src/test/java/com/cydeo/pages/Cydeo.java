package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Cydeo {
    public Cydeo() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(xpath = "//select[@id='month']//option")
    public List<WebElement> listOfMonths;
    @FindBy(id="month")
    public WebElement month_place;

}
