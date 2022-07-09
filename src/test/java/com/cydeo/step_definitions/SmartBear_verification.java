package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBear;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SmartBear_verification {
    SmartBear smartBear = new SmartBear();

    @Given("User enter login and password and click login")
    public void user_enter_login_and_password_and_click_login() {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlSmartBear" ) );
        assertTrue( Driver.getDriver().getTitle().contains( "Web Orders Login" ) );
        smartBear.username.sendKeys( "Tester" );
        smartBear.password.sendKeys( "tester" );
        smartBear.login_bt.click();
    }

    @Then("User is logged into SmartBear Tester account")
    public void user_is_logged_into_smart_bear_tester_account() {
        assertTrue( smartBear.avatar.getText().contains( "Tester" ) );

    }

    @Then("go on Order page")
    public void go_on_order_page() {
        smartBear.order.click();

    }

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        assertEquals( smartBear.main_header.getText(), "Order" );
        Select productSelection = new Select( smartBear.product );
        productSelection.selectByValue( "FamilyAlbum" );

    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String number) {
        smartBear.quantity.sendKeys( number );

    }

    @When("User enters {string} to customer name")
    public void user_enters_to_customer_name(String name) {
        smartBear.customer_name.sendKeys( name );
    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        smartBear.street.sendKeys( street );
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        smartBear.city.sendKeys( city );
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBear.state.sendKeys( state );
    }

    @When("User enters {string} as zipcode")
    public void user_enters_as_zipcode(String zipcode) {
        smartBear.zip_code.sendKeys( zipcode );
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String card_type) {
        smartBear.visa.sendKeys( card_type );
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String card_number) {
        smartBear.card_number.sendKeys( card_number );

    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String date) {
        smartBear.date.sendKeys( date );
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBear.process_bt.click();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String searchName) {
        for (WebElement each : smartBear.nameList) {
            if (each.getText().equals( searchName )) {
                System.out.println( "verified" + searchName + "in the list" );
                break;
            }
        }
    }
}
