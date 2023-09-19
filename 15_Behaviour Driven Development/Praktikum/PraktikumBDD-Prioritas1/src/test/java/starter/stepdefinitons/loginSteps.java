package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    @Given("i go to Login page")
    public void userIsOnLinkedInHomepage() {
        System.out.println("I am in login page");
    }
    @When("i input valid email and valid password")
    public void inputValidEmailAndValidPassword() {
        System.out.println("valid email and valid password");
    }
    @And("i click login button")
    public void userClicksLoginButton() {
        System.out.println("click login button");
    }
    @Then("i am on the homepage of LinkedIn")
    public void userShouldBeLoggedInSuccessfully() {
        System.out.println("I am on the homepage");
    }


    @When("i input invalid email and valid password")
    public void inputInvalidEmailAndValidPassword() {
        System.out.println("invalid email");
    }
    @Then("i didn't make it to the to homepage and get error message in the email")
    public void userGetErrorMessageInvalidEmail() {
        System.out.println("Wrong email or password. Try again or create an account .");
    }


    @When("i input valid email and invalid password")
    public void inputValidEmailAndInvalidPassword() {
        System.out.println("invalid password");
    }
    @Then("i didn't make it to the to homepage and get error message in the password")
    public void InvalidPassword() {
        System.out.println("Wrong email.");
    }


    @When("i input invalid email and invalid password")
    public void inputInvalidEmailAndInvalidPassword() {
        System.out.println("invalid email and invalid password");
    }
    @Then("i didn't make it to the to homepage and get error message in the email and password")
    public void InvalidEmailAndPassword() {
        System.out.println("Wrong email or password.");
    }


    @When("i did not input email but input valid password")
    public void didNotInputEmailButValidPassword() {
        System.out.println("null email");
    }
    @Then("i didn't make it to the to homepage and get error message because did not input email")
    public void userGetErrorMessageNullEmail() {
        System.out.println("Please enter an email address or phone number.");
    }


    @When("i input valid email but did not input password")
    public void inputEmailButDidNotInputPassword() {
        System.out.println("null password");
    }
    @Then("i didn't make it to the to homepage and get error message because did not input password")
    public void userGetErrorMessageNullPassword() {
        System.out.println("Please enter a password.");
    }


    @When("i did not input email and password")
    public void didNotInputEmailAndPassword() {
        System.out.println("null email and password");
    }
    @Then("i didn't make it to the to homepage and get error message because did not input email and password")
    public void userGetErrorMessageNullEmailAndPassword() {
        System.out.println("Please enter an email address or phone number and password");
    }
}
