package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.AboutTest;
import starter.pages.LoginSaucedemo;

public class AboutSteps {
    @Steps
    LoginSaucedemo loginSaucedemo;

    @Steps
    AboutTest aboutTest;

    @When("I click on the side navbar button")
    public void iClickOnTheSideNavbarButton() {
        aboutTest.clickNavbarButton();
    }

    @And("I select the About menu from the side navbar")
    public void iSelectTheAboutMenuFromTheSideNavbar() {
        aboutTest.clickAboutMenu();
    }

    @Then("I click cookie Notice and I see Website and mobile testing as success sign text on the about page")
    public void iClickCookieNotice() {
        aboutTest.clickCookieNotice();
    }

    @Given("I am on the homepage with username {string} and password {string}")
    public void iAmOnTheHomepageWithUsernameAndPassword(String username, String password) {
        loginSaucedemo.openLoginPage();
        loginSaucedemo.validateOnLoginPage();
        loginSaucedemo.inputUsername("problem_user");
        loginSaucedemo.inputPassword("secret_sauce");
        loginSaucedemo.clickLoginButton();
    }

    @Then("I click cookie Notice and I see lost page as failed sign text on the about page")
    public void iSeeAsFailedSignTextOnTheAboutPage() {
        aboutTest.clickCookieNotice();
    }


}
