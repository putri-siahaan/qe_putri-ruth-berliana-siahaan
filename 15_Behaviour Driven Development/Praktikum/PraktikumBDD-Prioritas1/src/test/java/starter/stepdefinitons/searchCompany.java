package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchCompany {

    @Given("As a user i am already on the homepage of LinkedIn and clicked the search field")
    public void clickedSearchField() {
        System.out.println("already to input the text");
    }
    @When("I input the valid name of the Company and press ENTER on the keyboard")
    public void validCompany() {
        System.out.println("input valid name of company: CODE.ID");
    }
    @And("select the company I want to know information about")
    public void selectCompany() {
        System.out.println("success to select the company");
    }
    @Then("I success to get the information from the company")
    public void successfulSearch() {
        System.out.println("Success to get information about CODE.ID company");
    }



    @When("I input the invalid name of the Company and press ENTER on the keyboard")
    public void invalidCompany() {
        System.out.println("input invalid name of company: COODEE ID");
    }
    @And("no company search results")
    public void searchResults() {
        System.out.println("empty result");
    }
    @Then("I am failed to get the information from the company")
    public void failedSearch() {
        System.out.println("Failed to search CODE.ID Company");
    }
}
