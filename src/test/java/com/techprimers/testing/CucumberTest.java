package com.techprimers.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "src/test/java/com/techprimers/testing/FizzBuzzStepdefs",
        format = {"json:target/cucumber.json"}
)
public class CucumberTest {
}
