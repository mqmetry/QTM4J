package com.techprimers.testing;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.techprimers.testing",
        plugin = {"json:target/cucumber/cucumber.json"},
        publish = true
        


)
public class CucumberTest {
}
