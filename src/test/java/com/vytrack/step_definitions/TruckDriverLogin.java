package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.utility_driver.ConfigurationReader;
import com.vytrack.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class TruckDriverLogin {
    @Given("Truck driver is on the Login page")
    public void truck_driver_is_on_the_login_page() {
        //verify im on Authorization page
        Assert.assertEquals("Authorization",Driver.getDriver().getTitle());
    }
    @When("Truck driver inputs correct credentials")
    public void truck_driver_inputs_correct_credentials() {
        LoginPage loginPage = new LoginPage();
        //login
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        //password
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        //login bt
        loginPage.login.click();
    }
    @Then("Truck driver should navigate to DashboardPage")
    public void truck_driver_should_navigate_to_dashboard_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //verify im on Dashboard page
       Assert.assertEquals("Dashboard",Driver.getDriver().getTitle());

    }
}