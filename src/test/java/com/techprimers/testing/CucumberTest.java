package com.techprimers.testing;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.techprimers.testing",
        publish = true,
    	plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
    	monochrome = true

)
public class CucumberTest {
}
