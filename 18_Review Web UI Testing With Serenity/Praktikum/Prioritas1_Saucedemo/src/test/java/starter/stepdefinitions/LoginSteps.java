package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginSaucedemo;

public class LoginSteps {

    @Steps
    LoginSaucedemo loginSaucedemo;

    @Given("I am on the Login page Swag Labs")
    public void userIsOnSaucedemoLoginPage(){
        loginSaucedemo.openLoginPage();
        loginSaucedemo.validateOnLoginPage();
    }
    @When("I input valid {string}")
    public void iInputValid(String username) {
        loginSaucedemo.inputUsername(username);
    }
    @And("I input valid password")
    public void userInputValidPassword(){
        loginSaucedemo.inputPassword("secret_sauce");
    }
    @And("i click login button")
    public void userClickLoginButton(){
        loginSaucedemo.clickLoginButton();
    }
    @Then("i am on homepage saucedemo and see various Products")
    public void variousProducts(){
        loginSaucedemo.validateHomePage();
    }


    @When("I input locked username")
    public void inputLockedUsername(){
        loginSaucedemo.inputUsername("locked_out_user");
    }
    @Then("i am still on the login page and see error message {string}")
    public void iAmStillOnTheLoginPageAndSeeErrorMessage(String errorMessage) {
        loginSaucedemo.validateErrorMessageDisplayed();
        loginSaucedemo.validateEqualErrorMessage(errorMessage);
    }
}