package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "html:target/cucumber-reports.html",
            features = "src/test/resources_VyTruck/features",
            glue = "com/vytrack/step_definitions",
            dryRun = false,
            tags = "@vytrackWip")

    public class ButtonRunner {

    }

