package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class updateProfileSteps {
    @Given("As a user i am already on the login page of Sepulsa")
    public void userIsOnSepulsaLoginPage() {
        System.out.println("I am in login page Sepulsa");
    }
    @When("User clicks \"Account\" menu")
    public void clickAccountMenu() {System.out.println("I click \"Account\" menu");}
    @And("User clicks on \"View & change profiles\"")
    public void clickOnViewAndEditProfile() {
        System.out.println("click view and change profiles");
    }
    @And("User clicks on \"Change Profile\"")
    public void clickOnEditProfile() {
        System.out.println("click change profile");
    }
    @And("User inputs their name as \"Putri Siahaan\"")
    public void inputMyName() {
        System.out.println("input name : Putri Siahaan");
    }
    @And("User inputs their phone number as \"085260897523\"")
    public void inputMyPhoneNumber() {
        System.out.println("input phone number : 085260897523");
    }
    @And("User clicks on \"Update Profile\"")
    public void clickOnUpdateProfile() {
        System.out.println("input phone number : 085260897523");
    }
    @Then("User should see a success message \"Profile updated successfully\"")
    public void updatedSuccessfully(){System.out.println("my profile should be updated successfully");}


    @And("User inputs an invalid phone number \"85260897523\"")
    public void invalidPhoneNumber() {
        System.out.println("input invalid phone number : 85260897523");
    }
    @Then("User should see an error message \"Your cellphone number format is wrong. Don't forget the number 0 in front.\"")
    public void errorMessageInvalidPhoneNumber() {System.out.println("Your cellphone number format is wrong. Don't forget the number 0 in front.");}


    @And("User inputs an invalid name as \"v\"")
    public void inputInvalidName() {
        System.out.println("input invalid name : v");
    }
    @And("User can't click the login button")
    public void canNotClickLoginButton() {
        System.out.println("i can not click the login button.");
    }
    @Then("User should see an error message \"The name you entered is too short. Minimum 2 letters.\"")
    public void errorMessageInvalidName(){System.out.println("The name you entered is too short. Minimum 2 letters.");}








}
