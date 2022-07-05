package com.cydeo.step_definitions;

import com.cydeo.pages.Etsy;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Etsy_verification {
    Etsy etsy = new Etsy();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlEtsy" ) );
    }

    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String exp_title = "Etsy_verification - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals( exp_title, Driver.getDriver().getTitle() );
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsy.search_box.sendKeys( "Wooden Spoon" );

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsy.search_bt.click();

    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        Assert.assertTrue( Driver.getDriver().getTitle().contains( "Wooden Spoon") );
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchWord) {
        etsy.search_box.sendKeys( searchWord );
    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String result) {
        Assert.assertTrue( Driver.getDriver().getTitle().contains( result) );
    }

}
