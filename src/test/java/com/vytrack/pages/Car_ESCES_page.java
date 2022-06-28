package com.vytrack.pages;

import com.vytrack.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Car_ESCES_page {
    public Car_ESCES_page() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(css = "a[title='Reset']")
    public WebElement reset;
    @FindBy(css = "a[title='Grid Settings']")
    public WebElement gridSettings;
}
