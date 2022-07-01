package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class TC07 {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "html:target/cucumber-reports.html",
            features = "src/test/resources_VyTruck/features/TruckDriverDashboard.feature",
            glue = "com/vytrack/runner",
            dryRun = false,
            tags = "@Smoke")
    public class ButtonRunner {

    }
}
