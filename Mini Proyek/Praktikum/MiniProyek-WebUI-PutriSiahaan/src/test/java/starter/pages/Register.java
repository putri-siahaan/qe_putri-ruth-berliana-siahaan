package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {

    private By menuLogin(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span/i");
    }

    private By register(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div/a");
    }
    private By namaLengkapField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }

    private By emailField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    private By passwordField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");
    }

    private By registerButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button/span");
    }

    private By successRegister(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[1]");
    }


    private By failedRegister_ErrorMessage(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    private By failedRegisterBecauseInvalidEmail(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]");
    }



    //TC_Register_1 [Positive]
    @Step
    public void openAltaShopePage(){
        open();
    }

    @Step
    public void clickMenuLogin(){$(menuLogin()).click();
    }

    @Step
    public void clickRegister(){$(register()).click();
    }

    @Step
    public void inputNamaLengkap(String nama_lengkap){$(namaLengkapField()).type(nama_lengkap);
    }

    @Step
    public void inputEmail(String email){$(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){$(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton(){$(registerButton()).click();
    }

    @Step
    public void validateSuccessRegister() {
        $(successRegister()).isDisplayed();
    }

    @Step
    public boolean validateBackToMenuLogin(String backToMenuLogin){
        return $(successRegister()).getText().equalsIgnoreCase(backToMenuLogin);
    }


    //TC_Register_2 [Negative 1]

    @Step
    public void validateFailedRegisterBecauseEmailIsAlready() {
        $(failedRegister_ErrorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessageEmailAlreadyRegistered(String errorMessage){
        return $(failedRegister_ErrorMessage()).getText().equalsIgnoreCase(errorMessage);
    }






    //TC_Register_3 [Negative 2]
    @Step
    public void validateFailedRegisterBecauseDidNotInputFullName() {
        $(failedRegister_ErrorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessageFullName(String errorMessageFullName){
        return $(failedRegister_ErrorMessage()).getText().equalsIgnoreCase(errorMessageFullName);
    }







    //TC_Register_4 [Negative 3]

    @Step
    public void validateFailedRegisterBecauseDidNotInputEmail() {
        $(failedRegister_ErrorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessageEmail(String errorMessageEmail){
        return $(failedRegister_ErrorMessage()).getText().equalsIgnoreCase(errorMessageEmail);
    }






    //TC_Register_5 [Negative 4]

    @Step
    public void validateFailedRegisterBecauseDidNotInputPassword() {
        $(failedRegister_ErrorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorPassword(String errorMessagePassword){
        return $(failedRegister_ErrorMessage()).getText().equalsIgnoreCase(errorMessagePassword);
    }

}
