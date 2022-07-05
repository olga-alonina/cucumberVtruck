package com.library.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
     public Users(){
  Driver.getDriver().get( "https://library1.cydeo.com" );
        PageFactory.initElements( Driver.getDriver(), this );
}
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
    @FindBy(css = "a[onclick='Users.edit_user(10169)']")
    public WebElement edit_user_bt;//probably 1 one need to check in usage
    @FindBy(xpath = "//span[contains(text(),'Loading')]")
    public WebElement loading_in_table;
    @FindBy(css = "th[data-name='id']")
    public WebElement user_id;//table also click for reordering
    //************
    //for checking which way sorting is happened, check : aria-sort="descending" ***********

    @FindBy(css = "th[data-name='full_name']")
    public WebElement full_name;//table also click for reordering
    @FindBy(css = "th[data-name='email']")
    public WebElement email;//table also click for reordering
    @FindBy(css = "th[data-name='group_name']")
    public WebElement group;//table also click for reordering
    @FindBy(css = "th[data-name='status']")
    public WebElement status;//table also click for reordering
    @FindBy(css = "select[name='tbl_users_length']")
    public WebElement show_amount_records;// for choosing exact amount use dropdown menu
    @FindBy(id="tbl_users_info")
    public WebElement showing_entries;

}
