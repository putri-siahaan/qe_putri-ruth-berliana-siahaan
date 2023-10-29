package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Logout;
import starter.pages.Register;

public class LogoutSteps {
    @Steps
    Login login;

    @Steps
    Register register;

    @Steps
    Logout logout;



    //TC_Logout_1 [Positive]

    @Given("I am on the home page Altashop with an account that has been success logged in")
    public void iAmOnTheHomePageAltashopWithAnAccountThatHasBeenSuccessLoggedIn() {
        register.openAltaShopePage();
        register.clickMenuLogin();
        login.inputValidEmail("ruth-ana@gmail.com");
        login.inputValidPassword("Siahaan123");
        login.clickLoginButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.validateSuccessLogin();
    }

    @When("I click user icon")
    public void iClickUserIcon() {
        logout.clickUserIcon();
    }

    @And("I click logout in the option of user icon")
    public void iClickLogoutInTheOptionOfUserIcon() {
        logout.clickLogoutButton();
    }

    @Then("validate success to {string} page")
    public void validateSuccessToPage(String goToMenuLogin) {
        logout.validateSuccessLogout();
        logout.validateBackToMenuLogin(goToMenuLogin);
    }
}
