package com.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources_cydeo/features/wanna_sleep.feature",//todo change it
        glue = "com/cydeo/runner",
        dryRun = false,
        tags = "@librarian or @student"
)
public class CukesRunner {

}
