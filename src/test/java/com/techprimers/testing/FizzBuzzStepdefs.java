import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class FizzBuzzStepdefs {


    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() throws Throwable {
        System.out.println("Created New Game");
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) throws Throwable {
        System.out.println("Played with a number");
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        Assert.assertEquals(1, 1);
    }
}
