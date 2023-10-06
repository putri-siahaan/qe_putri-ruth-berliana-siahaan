package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen loginScreen = new LoginScreen();

    @Given("user on the login page")
    public void onTheLoginPage(){
        loginScreen.isOnLoginPage();
    }

    @When("user input {string} on email field")
    public void userInputOnEmailField(String email) {
        loginScreen.inputEmail(email);
    }

    @And("user input {string} on password field")
    public void userInputOnPasswordField(String password) {
        loginScreen.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("user see success to homepage app {string}")
    public void userSeeSuccessToHomepageApp(String successLogin) {
        Assert.assertEquals(successLogin, loginScreen.getSuccessMessage());
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage, loginScreen.getErrorMessage());
    }


}
