package com.automated.qa.tests.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.automated.qa.tests",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@Booking"

)

public class TestRunner {
}
