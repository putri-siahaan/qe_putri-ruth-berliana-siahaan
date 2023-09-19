package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class viewProfile {
    @Given("As a user i am on the homepage of LinkedIn")
    public void onTheHomepage() {
        System.out.println("i am on the homepage of LinkedIn");
    }
    @When("I click button Me, which is located beside notification button")
    public void clickButtonMe() {
        System.out.println("I click button Me");
    }
    @And("I click View Profile")
    public void clickViewProfile() {
        System.out.println("click View Profile");
    }
    @Then("I success to see detail of my profile")
    public void successfulConnected() {
        System.out.println("Success to see detail of my profile");
    }
}
