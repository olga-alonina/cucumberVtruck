package com.cydeo.step_definitions;

import com.cydeo.pages.WebTable;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin {
    WebTable table = new WebTable();
    @When("user enter below credentials")
    public void user_enter_below_credentials(Map<String,String> credentials) {

        table.login(credentials.get("username"),credentials.get("password"));
    }


    @When("Enter username {string}, enter password {string}")
    public void enter_username_enter_password(String username, String password) {
        table.login( username, password );
    }

    @Given("user on the table login page")
    public void user_on_the_table_login_page() throws InterruptedException {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlWebTable" ) );

    }

    @When("Enter username {string}")
    public void enter_username(String username) {
        table.username.sendKeys( username );
    }

    @When("Enter password {string}")
    public void enter_password(String password) {
        table.password.sendKeys( password );
        table.login_bt.click();
    }

    @Then("user should verify that URL ended with orders")
    public void user_should_verify_that_url_ended_with_orders() {
        Assert.assertTrue( Driver.getDriver().getCurrentUrl().endsWith( "orders" ) );
    }

}
