package com.cydeo.step_definitions;

import com.cydeo.pages.Cydeo;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class cydeo_dropdowns_step {

    Cydeo cydeo = new Cydeo();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlCydeo" ) );

    }

    @Then("User should see below info in <month> dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> months) {
        cydeo.month_place.click();
        Select menu = new Select( cydeo.month_place );
        for (String each : months) {
            if (menu.getFirstSelectedOption().getText().equals( each )) {
                System.out.println( "verified" );
            }
        }
    }
}

