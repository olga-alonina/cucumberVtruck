package com.vytrack.step_definitions;

import com.vytrack.pages.Car_ESCES_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TruckDriver_Car_ESCES_page {
    Car_ESCES_page carPage = new Car_ESCES_page();

    @Given("Truck driver on Car_ESCES_page")
    public void truck_Driver_On_Car_ESCES_page() {
    }

    @When("navigate to reset button")
    public void navigate_To_Reset_Button() {

    }

    @Then("Grid Settings should be on the right side of the Reset button")
    public void grid_Settings_Should_Be_On_The_Right_Side_Of_The_Reset_Button() {
        Assert.assertTrue( carPage.reset.getLocation().x < carPage.gridSettings.getLocation().x );

    }
}
