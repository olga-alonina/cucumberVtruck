package com.vytrack.pages;

import com.vytrack.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.vytrack.utilities.utility_driver.BrowserUtils.logInVytrack;
import static com.vytrack.utilities.utility_driver.BrowserUtils.verify_title_with_equalMethod;

public class DashboardPage {
    public DashboardPage() {
        logInVytrack();
        verify_title_with_equalMethod( "Dashboard" );
        PageFactory.initElements( Driver.getDriver(), this );
    }
    @FindBy(xpath = "(//span[normalize-space(text())='Fleet'])[1]")
    public WebElement fleet;
    @FindBy(xpath = "(//span[@class=\"title title-level-2\"])[1]")
    public WebElement vehicles;

}
