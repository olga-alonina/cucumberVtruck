package com.cydeo.step_definitions;

import com.cydeo.pages.CRM;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class CRM_steps {
    CRM newbie = new CRM();

    @Given("User is on the login page of CRM")
    public void user_is_on_the_login_page_of_crm() {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlCRM" ) );
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
        newbie.login(credentials.get("username"),credentials.get("password"));
    }

    @Then("User should see")
    public void user_should_see(List<String>list) {
        newbie.calendar.click();
        newbie.comp_calendar.click();
       // Assert.assertEquals(newbie.listOfMonths.get( 0 ).getText(),list);
    }
}
