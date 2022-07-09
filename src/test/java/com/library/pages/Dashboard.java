package com.library.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    public Dashboard() {
        Driver.getDriver().get( "https://library1.cydeo.com" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    //library page(dashboard) as librarian//todo check as student too
    //top line
    @FindBy(css = "a[class='navbar-brand']")
    public WebElement library_sign;
    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboard_sign;
    @FindBy(xpath = "//span[.='Users']")
    public WebElement users_sign;
    @FindBy(xpath = "//span[.='Books']")
    public WebElement books_sign;
    @FindBy(xpath = "//span[contains(text(),'Test Librarian')]")//xz which librarian will be
    public WebElement avatar;//contain drop down menu
    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement log_out_avatar;
    @FindBy(id = "user_count")
    public WebElement user_count;
    @FindBy(xpath = "//h6[.='Books']")
    public WebElement books_count;
    @FindBy(xpath = "//h6[.='Borrowed Books']")
    public WebElement borrowed_books;
    @FindBy(tagName = "strong")
    public WebElement version_library;

}
