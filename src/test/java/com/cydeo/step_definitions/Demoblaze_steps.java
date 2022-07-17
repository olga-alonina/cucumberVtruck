package com.cydeo.step_definitions;

import com.cydeo.pages.AdidasPage;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.cydeo.utilities.browserUtils.browser.waitFor;

public class Demoblaze_steps {
    AdidasPage adidasPage = new AdidasPage();
    int actualPrice = 0;
    int expectedPrice = 0;

    @Given("customer is on homepage")
    public void customer_is_on_homepage() {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlShop" ) );
    }

    @When("click on {string}")
    public void click_on(String buttonName) {
        adidasPage.click_on( buttonName );
    }

    @When("delete {string} from cart")
    public void delete_from_cart(String deletingName) {
        adidasPage.findWhatToDelete( deletingName );

    }

    @When("fill in all web form fields")
    public void fill_in_all_web_form_fields() {
        adidasPage.fillForm();
    }

    @When("capture and log purchase Id and Amount")
    public void capture_and_log_purchase_id_and_amount() {
        String confirmationMessage = adidasPage.confirmation.getText();
        System.out.println( "confirmationMessage = " + confirmationMessage );
        String[] confirmationArray = confirmationMessage.split( "\n" );
        for (String eachLine : confirmationArray) {
            if (eachLine.startsWith( "Id:" )) {
                System.out.println( eachLine );
            }
            if (eachLine.startsWith( "Amount:" )) {
                eachLine = eachLine.replace( " USD", "");
                eachLine = eachLine.replace( "Amount: ", "");
                eachLine = eachLine.trim();
                System.out.println( eachLine );
                actualPrice = Integer.parseInt( eachLine );
            }
        }
    }

    @When("assert purchase amount equals expected")
    public void assert_purchase_amount_equals_expected() {
        String price = adidasPage.totalPrice.getText();
        expectedPrice = Integer.parseInt( price );
        Assert.assertEquals( "Prices is not match, check again",
                actualPrice, expectedPrice );


    }

    @Then("customer should be able to verify that there is no product in the cart")
    public void customer_should_be_able_to_verify_that_there_is_no_product_in_the_cart() {
        System.out.println( adidasPage.allProductFromCart.size() );
        waitFor( 2 );
        Assert.assertEquals( 0, adidasPage.allProductFromCart.size() );

    }

    @When("click on {string} and {string}")
    public void clickOnAnd(String device, String brand) throws InterruptedException {
        adidasPage.click_on( device );
        waitFor( 2 );
        adidasPage.clickOnBrand( brand );

    }
}
