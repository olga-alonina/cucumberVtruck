package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOrdersPage extends BasePage{
    @FindBy(xpath = "//tr[1]/td[1]")
    public WebElement first_row;
}
