import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class FizzBuzzStepdefs {

    int num1;
    int num2;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() throws Throwable {
        num1 = 5;
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) throws Throwable {
        num = 5;
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        Assert.assertEquals(num1, num2);
    }
}
