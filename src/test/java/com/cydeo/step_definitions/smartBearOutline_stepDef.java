package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBear;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class smartBearOutline_stepDef {
    SmartBear bear = new SmartBear();

    @Given("user is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page(Map<String, String> credentials) {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlSmartBear" ) );
        bear.login( credentials.get( "username" ), credentials.get( "password" ) );

    }

    @When("user selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String product) {
        bear.order.click();
        Select menu = new Select( bear.product );
        menu.selectByValue( product );
    }

    @Then("user enters {int} to quantity")
    public void user_enters_to_quantity(int quantity) {
        bear.quantity.sendKeys( "" + quantity );
    }

    @Then("user enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customer_name) {
        bear.customer_name.sendKeys( customer_name );
    }

    @Then("user enters {string} to street")
    public void user_enters_to_street(String street) {
        bear.street.sendKeys( street );
    }

    @Then("user enters {string} to city")
    public void user_enters_to_city(String city) {
        bear.city.sendKeys( city );
    }

    @Then("user enters {string} to state")
    public void user_enters_to_state(String state) {
        bear.state.sendKeys( state );
    }

    @Then("user enters {int}")
    public void user_enters(int zipcode) {
        bear.zip_code.sendKeys( ""+zipcode );
    }

    @Then("user selects {string} as card type")
    public void user_selects_as_card_type(String card_type) {
        bear.visa.sendKeys( card_type );
    }

    @Then("user enters {string} to card number")
    public void user_enters_to_card_number(String card_number) {
        bear.card_number.sendKeys( card_number );
    }

    @Then("user enters {string} to expiration date")
    public void user_enters_to_expiration_date(String date) {
        bear.date.sendKeys( date );
    }

    @When("user clicks process button")
    public void user_clicks_process_button() {
     bear.process_bt.click();
    }

    @Then("user verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String name) {
       for(WebElement searchName: bear.nameList) {
           if(searchName.getText().equals( name )){
               System.out.println("verified");
               break;
           }
       }
    }
}
