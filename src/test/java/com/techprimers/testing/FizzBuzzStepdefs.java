package com.techprimers.testing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class FizzBuzzStepdefs {

    FizzBuzz fizzBuzz;
    String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() throws Throwable {
        system.out.println("Created New Game");
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) throws Throwable {
        system.out.println("Played with a number");
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        system.out.println("Result Printed");
    }
}
