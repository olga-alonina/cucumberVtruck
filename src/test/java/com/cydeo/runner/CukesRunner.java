package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources_cydeo/features/wanna_sleep.feature",
        glue = "com/cydeo/runner",
        dryRun = true,
        tags = "@sleeping")
public class CukesRunner {

}
