package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class historySteps {
    @Given("I am already on the login page of Sepulsa")
    public void onSepulsaLoginPage() {
        System.out.println("I am in login page Sepulsa");
    }
    @When("I click on the \"History\" menu")
    public void clickHistoryMenu() {System.out.println("I click \"History\" menu");}
    @And("I click the \"Success\" button")
    public void clickSuccessButton() {
        System.out.println("Passed Click Success Button");
    }
    @Then("I should see successful transaction history")
    public void successTransaction(){System.out.println("Viewing successful transaction history");}


    @And("I click the \"Pending\" button")
    public void clickPendingButton() {
        System.out.println("Passed Click Pending Button");
    }
    @Then("I should see pending transaction history")
    public void pendingTransaction(){System.out.println("Viewing Pending transaction history");}


    @And("I click the \"Fail\" button")
    public void clickFailButton() {
        System.out.println("Passed Click Fail Button");
    }
    @Then("I should see failed transaction history")
    public void FailTransaction(){System.out.println("Viewing Fail transaction history");}

}
