package com.vytrack.step_defenitions;

import com.vytrack.pages.Car_ESCES_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TruckDriver_Car_ESCES_page {
    Car_ESCES_page carPage = new Car_ESCES_page();

    @Given("Truck driver on Car_ESCES_page")
    public void truckDriverOnCar_ESCES_page() {
    }

    @When("navigate to reset button")
    public void navigateToResetButton() {

    }

    @Then("Grid Settings should be on the right side of the Reset button")
    public void gridSettingsShouldBeOnTheRightSideOfTheResetButton() {
        Assert.assertTrue(
                carPage.reset.getLocation().x < carPage.gridSettings.getLocation().x );

    }
}
