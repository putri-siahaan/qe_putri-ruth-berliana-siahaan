package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    @Given("i am on the Login page Sepulsa")
    public void userIsOnSepulsaLoginPage() {
        System.out.println("I am in login page Sepulsa");
    }
    @When("i input valid email and valid password")
    public void inputValidEmailAndValidPassword() {
        System.out.println("valid email and valid password");
    }
    @And("i click login button")
    public void userClicksLoginButton() {
        System.out.println("click login button");
    }
    @Then("i am on the homepage of Sepulsa")
    public void userShouldBeLoggedInSuccessfully() {
        System.out.println("I am on the homepage");
    }


    @When("i input invalid email and valid password")
    public void inputInvalidEmailAndValidPassword() {
        System.out.println("invalid email");
    }
    @Then("i am failed go to homepage and get error message because invalid email")
    public void userGetErrorMessageInvalidEmail() {System.out.println("Try remembering your e-mail address/cellphone number and password. There's still something wrong.");}


    @When("i input valid email and invalid password")
    public void inputValidEmailAndInvalidPassword() {
        System.out.println("invalid password");
    }
    @Then("i am failed go to homepage and get error message because invalid password")
    public void InvalidPassword() {System.out.println("Try remembering your e-mail address/cellphone number and password. There's still something wrong.");}


    @When("i input invalid email and invalid password")
    public void inputInvalidEmailAndInvalidPassword() {
        System.out.println("invalid email and invalid password");
    }
    @Then("i am failed go to homepage and get error message because invalid email and password")
    public void InvalidEmailAndPassword() {System.out.println("Try remembering your e-mail address/cellphone number and password. There's still something wrong.");}


    @When("i did not input email but input valid password")
    public void didNotInputEmailButValidPassword() {
        System.out.println("null email");
    }
    @And("I can't click the login button")
    public void clickLoginButton() {
        System.out.println("i can't click the login button");
    }
    @Then("I'm still on the login page and can't get to the main page because null email")
    public void userGetErrorMessageNullEmail() {
        System.out.println("Still on the login page");
    }


    @When("i input valid email but did not input password")
    public void inputEmailButDidNotInputPassword() {
        System.out.println("null password");
    }
    @Then("I'm still on the login page and can't get to the main page because null password")
    public void userGetErrorMessageNullPassword() {
        System.out.println("Still on the login page");
    }


    @When("i did not input email and password")
    public void didNotInputEmailAndPassword() {
        System.out.println("null email and password");
    }
    @Then("I'm still on the login page and can't get to the main page because null email and password")
    public void userGetErrorMessageNullEmailAndPassword() {
        System.out.println("Still on the login page");
    }

}
