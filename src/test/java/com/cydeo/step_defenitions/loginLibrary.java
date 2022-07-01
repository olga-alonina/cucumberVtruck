package com.cydeo.step_defenitions;

import com.library.pages.Library;
import com.cydeo.utilities.utility_driver.ConfigurationReader;
import com.cydeo.utilities.utility_driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class loginLibrary {
    Library library = new Library();
    Actions actions = new Actions( Driver.getDriver() );

    @Given("user is on the library login page")
    public void user_Is_On_The_Library_Login_Page() {
        String exp_title = "Login - Library";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(exp_title));

    }

    @When("user input correct login and password")
    public void user_Input_Correct_Login_And_Password() {
        actions.click( library.email ).sendKeys( ConfigurationReader.
            getProperty( "usernameLibrarian" ) );
        actions.click( library.password ).sendKeys( ConfigurationReader.
                getProperty( "passwordLibrary" ) );

    }

    @And("click on sign in button")
    public void click_On_Sign_In_Button() {
        library.sign_In.click();
    }

    @Then("user should able to see Dashboard page")
    public void user_Should_Able_To_See_Dashboard_Page() {
        String exp_title = "";//todo title after login with password
        Assert.assertTrue(Driver.getDriver().getTitle().contains(exp_title));
    }
}
