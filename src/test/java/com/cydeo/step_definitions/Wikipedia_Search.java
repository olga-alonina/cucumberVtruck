package com.cydeo.step_definitions;

import com.cydeo.pages.Wikipedia;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class Wikipedia_Search {
    Wikipedia wikipedia = new Wikipedia();
    Actions actions = new Actions( Driver.getDriver() );

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Assert.assertEquals( "Wikipedia", Driver.getDriver().getTitle() );
    }

    @When("User types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String sendkeys) {
        wikipedia.search_Input.sendKeys( sendkeys );
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        actions.click( wikipedia.search_bt );

    }

    @Then("User sees {string} is in the {string}")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String actual, String expected) {
        //wiki title
        Assert.assertEquals( Driver.getDriver().getTitle(), "Steve Jobs - Wikipedia" );
        // main_header
        Assert.assertEquals( wikipedia.main_header.getText(), "Steve Jobs" );
        // mage_header
        Assert.assertEquals( wikipedia.image_header.getText(), "Steve Jobs" );
    }

}
