package com.techprimers.testing;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

import org.junit.Assert;

@RunWith(Cucumber.class)
public class FizzBuzzStepdefs {

    FizzBuzz fizzBuzz;
    String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() throws Throwable {
        fizzBuzz = new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) throws Throwable {
        result = fizzBuzz.play(number);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        Assert.assertEquals(result, resultString);
    }
}
