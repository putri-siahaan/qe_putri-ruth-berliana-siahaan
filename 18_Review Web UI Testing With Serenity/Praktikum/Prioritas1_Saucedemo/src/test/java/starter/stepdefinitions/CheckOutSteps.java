package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ChekOutProses;
import starter.pages.LoginSaucedemo;

public class CheckOutSteps {

    @Steps
    LoginSaucedemo loginSaucedemo;

    @Steps
    ChekOutProses chekOutProses;

    @Given("I am on the homepage Saucedemo with username {string} and password {string}")
    public void iAmOnTheHomepageSaucedemoWithUsernameAndPassword(String username, String password) {
        loginSaucedemo.openLoginPage();
        loginSaucedemo.validateOnLoginPage();
        loginSaucedemo.inputUsername("standard_user");
        loginSaucedemo.inputPassword("secret_sauce");
        loginSaucedemo.clickLoginButton();
    }

    @When("I see the Products text on the inventory page")
    public void iSeeTheTextOnTheInventoryPage() {
        loginSaucedemo.validateHomePage();
    }

    @And("I add the Sauce Labs Bike Light items to my cart")
    public void addSauceLabsBikeLightItemsToCart() {
        chekOutProses.clickAddToCart();
    }

    @And("I click on the cart button")
    public void iClickOnTheCartButton() {
        chekOutProses.clickCartButton();
    }

    @And("I proceed to checkout")
    public void iProceedToCheckout() {
        chekOutProses.clickCheckoutButton();
    }

    @And("I fill in the first name as {string}")
    public void iFillInTheFirstNameAs(String firstName) {
        chekOutProses.inputFirstName("Putri");
    }

    @And("I fill in the last name as {string}")
    public void iFillInTheLastNameAs(String lastName) {
        chekOutProses.inputLastName("Siahaan");
    }

    @And("I enter the postal code as {string}")
    public void iEnterThePostalCodeAs(String postalCode) {
        chekOutProses.inputPostalCode("22314");
    }

    @And("I click continue to the next step")
    public void iClickContinueToTheNextStep() {
        chekOutProses.clickContinueButton();
    }

    @And("I click finish button")
    public void iClickFinishButton() {
        chekOutProses.clickFinishButton();
    }

    @Then("I see the {string} text as confirmation of the successful checkout")
    public void iSeeTheTextAsConfirmationOfTheSuccessfulCheckout(String successMessage) {
        chekOutProses.checkoutComplateDisplayed();
        chekOutProses.validateEqualCheckoutComplated(successMessage);

    }

    @Then("I notice an error message stating {string} as an indication of checkout failure.")
    public void iNoticeAnErrorMessageStatingAsAnIndicationOfCheckoutFailure(String errorMessage) {
        chekOutProses.errorMessageDisplayed();
        chekOutProses.validateEqualErrorMessage(errorMessage);
    }



}


