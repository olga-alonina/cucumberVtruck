package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class TC07 {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "html:target/cucumber-reports.html",
            features = "src/test/resources/features/TruckDriverDashboard.feature",
            glue = "com/vytrack/runner",
            dryRun = true,
            tags = "@Smoke")
    public class ButtonRunner {

    }
}
