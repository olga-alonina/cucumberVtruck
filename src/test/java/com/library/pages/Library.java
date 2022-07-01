package com.library.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library {
    public Library() {
        Driver.getDriver().get( "https://library1.cydeo.com" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    //authorization page
    @FindBy(css = "button[type='submit']")
    public WebElement sign_In;
    @FindBy(id = "inputEmail-error")
    public WebElement error_msg;
    @FindBy(css = "label[for='inputEmail']")
    public WebElement email;
    @FindBy(css = "label[for='inputPassword']")
    public WebElement password;
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
    @FindBy(id="user_count")
    public WebElement user_count;
    @FindBy(xpath = "//h6[.='Books']")
    public WebElement books_count;
    @FindBy(xpath = "//h6[.='Borrowed Books']")
    public WebElement borrowed_books;
    @FindBy(tagName = "strong")
    public WebElement version_library;

    //users page
    @FindBy(tagName = "h3")
    public WebElement user_management;
    @FindBy(id="user_groups")
    public WebElement user_group;
    @FindBy(id="user_status")
    public WebElement user_status;
    @FindBy(xpath = "//i[@class='fa fa-plus']")
    public WebElement add_user_bt;
    @FindBy(css = "input[type='search']")
    public WebElement search;
    @FindBy(css = "a[title='First']")
    public WebElement allBack_arrows;
    @FindBy(css = "a[title='Prev']")
    public WebElement return_prev_arrow;
    @FindBy(css = "a[title='Next']")
    public WebElement go_to_Next_arrow;
    @FindBy(css = "a[title='Last']")
    public WebElement allNext_arrows;
}
