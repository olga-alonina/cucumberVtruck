package com.vytrack.step_definitions;

import com.cydeo.utilities.utility_driver.Driver;
import com.vytrack.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TruckDriverDashboard {
    DashboardPage dashboardPage = new DashboardPage();

    @Given("Truck driver on Dashboard page")
    public void truck_driver_Dashboard_Page() {
    }

    @When("Truck driver hover over Fleet module")
    public void truck_driver_Hover_Over_Fleet_Module() {
        Actions actions = new Actions( Driver.getDriver() );
        actions.clickAndHold( dashboardPage.fleet );
    }

    @And("click on Vehicle from drop down menu")
    public void click_On_Vehicle_From_Drop_Down_Menu() {
        dashboardPage.vehicles.click();
    }

    @Then("Truck driver should navigate to Car_ESCES_page")
    public void truck_driver_should_navigate_to_Car_ESCES_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait( 15, TimeUnit.SECONDS );
        Assert.assertEquals( "Car - Entities - System - Car - Entities - System", Driver.getDriver().getTitle() );
    }
}

