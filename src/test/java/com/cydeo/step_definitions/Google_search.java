package com.cydeo.step_definitions;

import com.cydeo.pages.Google;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Google_search {
    Google google = new Google();

    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlGoogle" ) );
        Assert.assertEquals( Driver.getDriver().getTitle(), "Google" );
    }

    @When("User types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        google.search_window.sendKeys( "apple" + Keys.ENTER );

    }

    @Then("User sees apple – Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        Assert.assertEquals( Driver.getDriver().getTitle(), "apple – Google Search" );
    }

    @When("User types {string} in the google search box and clicks enter")
    public void user_Types_In_The_Google_Search_Box_And_Clicks_Enter(String inputWord) {
        google.search_window.sendKeys( inputWord + Keys.ENTER );
    }

    @Then("User sees {string} is in the google title")
    public void user_Sees_Is_In_The_Google_Title(String result) {
        System.out.println( "result = " + result );
        System.out.println( "Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle() );
        Assert.assertEquals( Driver.getDriver().getTitle(), result );
    }

    @When("User searches for {string} capital")
    public void user_searches_for_capital(String countryName) {
        google.search_window.sendKeys( "what is capital of " + countryName + Keys.ENTER );
    }

    @Then("User should see {string} in the result")
    public void user_should_see_in_the_result(String capitalCity) {
        Assert.assertEquals( capitalCity, google.capitalText.getText() );
    }
}
