package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wanna_sleep {
    @Given ("olya is sleepy")
    public void olya_is_sleepy() {
        System.out.println( "given" );
    }

    @When("she sleeps eight hours")
    public void she_sleeps_eight_hours() {
        System.out.println( "when" );

    }

    @Then("she will be happy")
    public void she_will_be_happy() {
        System.out.println( "then" );

    }
}

