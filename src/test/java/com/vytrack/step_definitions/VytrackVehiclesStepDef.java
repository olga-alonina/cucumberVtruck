package com.vytrack.step_definitions;

import com.cydeo.utilities.utility_driver.Driver;
import com.vytrack.pages.VytrackVehiclesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VytrackVehiclesStepDef {
    VytrackVehiclesPage vytrackVehiclesPage = new VytrackVehiclesPage();

//region Given

    @Given("User on the home page")
    public void user_on_the_home_page() {
        vytrackVehiclesPage.loginToVytrack();
    }

//endregion

    // region When
    @When("I hover over to {string} module")
    public void i_hover_over_to_module(String fleet) throws Exception {
        vytrackVehiclesPage.hoverOverToFleet( fleet );

    }

    @When("I click {string} option")
    public void i_click_option(String vehicleName) throws Exception {
        vytrackVehiclesPage.clickSubModule( vehicleName );
    }

// endregion

    //region Then


    @Then("I should see {string} page title")
    public void i_should_see_page_title(String pageTitle) throws InterruptedException {
        vytrackVehiclesPage.assertPageTitle( pageTitle );
    }

    @Then("{string} button on the right side of {string}")
    public void button_on_the_right_side_of(String one, String two){
        vytrackVehiclesPage.assertOneButtonIsLeftToAnother(one, two);
        Driver.closeDriver();
    }

}
//endregion

//region Helper Methods

//endregion
