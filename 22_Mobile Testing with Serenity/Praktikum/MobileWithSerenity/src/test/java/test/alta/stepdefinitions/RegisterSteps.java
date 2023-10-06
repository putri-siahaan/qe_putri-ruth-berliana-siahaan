package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;
import test.alta.pages.RegisterScreen;

public class RegisterSteps {

    @Steps
    LoginScreen loginScreen;

    @Steps
    RegisterScreen registerScreen;


    @Given("i am on the login page")
    public void iAmOnTheLoginPage(){
        loginScreen.isOnLoginPage();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("i click register link")
    public void iClickRegisterLink() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        registerScreen.clickLinkRegister();
    }

    @And("i input name {string} on name field")
    public void iInputNameOnNameField(String name) {
        registerScreen.inputNameRegister(name);
    }

    @And("i input email {string} on the email field")
    public void iInputEmailOnTheEmailField(String email) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        registerScreen.inputEmailRegister(email);
    }

    @And("i input password {string} on the password field")
    public void iInputPasswordOnThePasswordField(String password) {
        registerScreen.inputPasswordRegister(password);
    }

    @And("i input confirm password {string} in the confirm password field")
    public void iInputConfirmPasswordInTheConfirmPasswordField(String confirmPassword) {
        registerScreen.inputConfirmPasswordRegister(confirmPassword);
    }

    @And("i click register button")
    public void iClickRegisterButton() {
        registerScreen.clickRegisterButton();
    }

    @Then("i see message {string}")
    public void iSeeMessage(String successRegister) {
        Assert.assertEquals(successRegister, registerScreen.getRegistrationSuccessful());
    }

    @Then("i see error message {string}")
    public void iSeeErrorMessage(String emptyName) {
        Assert.assertEquals(emptyName, registerScreen.getErrorMessageRegistrationEmptyName());
    }

    @Then("i see error message in the confirm Password field {string}")
    public void iSeeErrorMessageInTheConfirmPasswordField(String confirmPasswordWrong) {
        Assert.assertEquals(confirmPasswordWrong, registerScreen.getErrorMessageRegistrationConfirmPassworWrong());
    }

    @Then("i see error message in the email field {string}")
    public void iSeeErrorMessageInTheEmailField(String invalidEmailRegistration) {
        Assert.assertEquals(invalidEmailRegistration, registerScreen.getErrorMessageRegistrationInvalidEmail());
    }
}
