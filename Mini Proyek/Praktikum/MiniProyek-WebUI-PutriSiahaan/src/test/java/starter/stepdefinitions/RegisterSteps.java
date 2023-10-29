package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Register;

public class RegisterSteps {

    //Email yang perlu diubah tiap kali menjalankan agar tidak ada error :
    //Register 1
    //Register 6
    //Register 7
    //Register 8
    //Register 9

    @Steps
    Register register;

    //TC_Register_1 [Positive]
    @Given("I am on the AltaShop page")
    public void iAmonTheAltaShopPage(){
        register.openAltaShopePage();
    }

    @When("I click menu login")
    public void iClickMenuLogin() {
        register.clickMenuLogin();
    }

    @And("I click register")
    public void iClickRegister() {
        register.clickRegister();
    }

    @And("I input valid nama_lengkap")
    public void iInputValidNamaLengkap() {
        register.inputNamaLengkap("Ana Siahaan");
    }

    @And("I input valid email in the field")
    public void iInputValidEmail() {
        register.inputEmail("ruthberliAna12345@gmail.com");
    }

    @And("I input valid the password")
    public void iInputValidPassword() {
        register.inputPassword("Siahaan123");
    }

    @And("i click register button to create a new account")
    public void iClickRegisterButtonToCreateANewAccount() {
        register.clickRegisterButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("validate success register and back to menu {string}")
    public void validateSuccessRegister(String backToMenuLogin) {
        register.validateSuccessRegister();
        register.validateBackToMenuLogin(backToMenuLogin);
    }






    //TC_Register_2 [Negative 1]

    @And("I input valid nama_lengkap in the field")
    public void iInputValidInTheField() {
        register.inputNamaLengkap("Coil Family");
    }

    @And("I input email that has been registered")
    public void iInputThatHasBeenRegistered() {
        register.inputEmail("ruthana@gmail.com");
    }

    @And("I input valid password int the field")
    public void iInputValidIntTheField() {
        register.inputPassword("abcdefg");
    }

    @And("i click register button")
    public void iClickRegisterButton() {
        register.clickRegisterButton();
        register.clickRegisterButton();
    }


    @Then("validate failed register and display error message {string}")
    public void validateFailedRegisterAndDisplayErrorMessage(String errorMessageEmailAlreadyRegistered) {
        register.validateFailedRegisterBecauseEmailIsAlready();
        register.validateEqualErrorMessageEmailAlreadyRegistered(errorMessageEmailAlreadyRegistered);
    }





    //TC_Register_3 [Negative 2]

    @And("I input the valid email in the field")
    public void iInputTheValidEmailInTheField() {
        register.inputEmail("ruthana@gmail.com");
    }

    @Then("validate failed register and display the error message {string}")
    public void validateFailedRegisterAndDisplayTheErrorMessage(String errorMessageFullName) {
        register.validateFailedRegisterBecauseDidNotInputFullName();
        register.validateEqualErrorMessageFullName(errorMessageFullName);
    }




    //TC_Register_4 [Negative 3]

    @Then("validate failed register and display error message is {string}")
    public void validateFailedRegisterAndDisplayErrorMessageIs(String errorMessageEmail) {
        register.validateFailedRegisterBecauseDidNotInputEmail();
        register.validateEqualErrorMessageEmail(errorMessageEmail);
    }





    //TC_Register_5 [Negative 4]

    @Then("validate failed register and display the error message is {string}")
    public void validateFailedRegisterAndDisplayTheErrorMessageIs(String errorMessagePassword) {
        register.validateFailedRegisterBecauseDidNotInputPassword();
        register.validateEqualErrorPassword(errorMessagePassword);
    }






    //TC_Register_6 [Negative 5]

    @And("I input invalid email in the field")
    public void iInputInvalidEmailInTheField() {
        register.inputEmail("ruth^1234^ana");
    }

    @Then("validate failed register and display the error message")
    public void validateFailedRegisterAndDisplayTheErrorMessage() {
        register.clickRegisterButton();
    }





    //TC_Register_7 [Negative 6]

    @And("I input valid email in the field of Register")
    public void iInputValidEmailInTheFieldOfRegister() {
        register.inputEmail("ruthputriana1234@gmail.com");
    }

    @And("I input nama_lengkap with a space")
    public void iInputNama_lengkapWithASpace() {
        register.inputNamaLengkap("       ");
    }




    //TC_Register_8 [Negative 7]

    @And("I input email with a space")
    public void iInputEmailWithASpace() {
        register.inputEmail("                                                                      ");
    }





    //TC_Register_9 [Negative 8]

    @And("I input a valid email in the field")
    public void iInputAValidEmailInTheField() {
        register.inputEmail("ruth!!@123ana@gmail.com");
    }

    @And("I input password with a space")
    public void iInputPasswordWithASpace() {
        register.inputPassword("       ");
    }

}
