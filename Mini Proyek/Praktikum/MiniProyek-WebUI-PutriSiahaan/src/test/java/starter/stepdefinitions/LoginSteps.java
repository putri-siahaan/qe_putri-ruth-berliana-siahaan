package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;

public class LoginSteps {

    @Steps
    Login login;


    //TC_Login_1 [Positive]

    @And("I input valid email")
    public void iInputValidEmail() {
        login.inputValidEmail("ruth-ana@gmail.com");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        login.inputValidPassword("Siahaan123");
    }

    @And("i click login button")
    public void iClickLoginButton() {
        login.clickLoginButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("validate success login and i am on the homepage AltaShop and display bar searching product {string}")
    public void validateSuccessLoginAndIAmOnTheHomepageAltaShop(String homepageAltaShop) {
        login.validateSuccessLogin();
        login.validatetoHomePageAltaShop(homepageAltaShop);
    }





    //TC_Login_2 [Negative 1]

    @And("I input invalid email")
    public void iInputInvalidEmail() {
        login.inputInvalidEmail("ruth--ana@gmail");
    }

    @Then("validate failed login and i am still on the login page and see error message {string}")
    public void validateFailedLoginAndIAmStillOnTheLoginPageAndSeeErrorMessage(String errorMessageLogin) {
        login.validateSFailedLoginBecauseInvalidEmail();
        login.validateEqualErrorMessageLogin(errorMessageLogin);
        
    }




    //TC_Login_3 [Negative 2]

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        login.inputInvalidPassword("abcdefghij");
    }
}
