package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Connection {

    @Given("As a user i am already on the homepage of LinkedIn")
    public void alreadyOnTheHomePage() {
        System.out.println("already on the home page");
    }
    @When("I click My Network menu")
    public void myNetworkMenu() {
        System.out.println("success to click my network menu");
    }
    @And("I click Accept to accept the invitation")
    public void acceptInvitation() {
        System.out.println("accept the invitation");
    }
    @Then("I successfully connected to them")
    public void successfulConnected() {
        System.out.println("Success Connect to them");
    }



    @And("I click ignore for the invitation")
    public void ignoreInvitation() {
        System.out.println("ignore the invitation");
    }
    @Then("I'm not connected to them")
    public void FailedConnected() {
        System.out.println("Failed connected to them");
    }
}
