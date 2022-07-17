package com.cydeo.step_definitions;

import com.cydeo.pages.AllOrdersPage;
import com.cydeo.pages.BasePage;
import com.cydeo.pages.WebTable;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class webTableOrder_steps {
    WebTable table = new WebTable();
    WebTableOrderPage orderPage = new WebTableOrderPage();
    BasePage base = new BasePage();
    AllOrdersPage page = new AllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlWebTable" ) );
        table.login( "Test", "Tester" );
        base.order.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        Select menu = new Select( orderPage.product );
        menu.selectByVisibleText( productType );
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        orderPage.quantity.sendKeys( "" + quantity );
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customer_name) {
        orderPage.customer_name.sendKeys( customer_name );
    }

    @When("user enters street {string}")
    public void user_enters_street(String street) {
        orderPage.street.sendKeys( street );
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        orderPage.city.sendKeys( city );
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
        orderPage.state.sendKeys( state );
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
        orderPage.zip_code.sendKeys( zipcode );
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String card_type) {
        for (WebElement each : orderPage.cardName) {
            if (each.getAttribute("value").equalsIgnoreCase( card_type )) {
                each.click();
            }
        }
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String card_number) {
        orderPage.card_number.sendKeys( card_number );
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String exp_date) {
        orderPage.exper_date.sendKeys( exp_date );
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.process_order.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expected_name) {
        Assert.assertEquals( page.first_row.getText(), expected_name );
    }

}
