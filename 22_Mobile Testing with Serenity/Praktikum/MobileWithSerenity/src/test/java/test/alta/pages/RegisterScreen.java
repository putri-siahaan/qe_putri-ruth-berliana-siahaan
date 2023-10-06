package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {

    private By registerLink(){
        return MobileBy.id("textViewLinkRegister");
    }

    private By nameFieldInRegister(){
        return MobileBy.id("textInputEditTextName");
    }

    private By emailFieldInRegister(){
        return MobileBy.id("textInputEditTextEmail");
    }

    private By passwordFieldInRegister(){
        return MobileBy.id("textInputEditTextPassword");
    }

    private By confirmPasswordFieldInRegister(){
        return MobileBy.id("textInputEditTextConfirmPassword");
    }

    private By registerButton(){
        return MobileBy.id("appCompatButtonRegister");
    }

    private By registrationSuccessful(){
        return MobileBy.id("snackbar_text");
    }

    private By registrationEmptyName(){return MobileBy.className("android.widget.TextView");}

    private By registrationConfirmPasswordWrong(){return MobileBy.className("android.widget.TextView");}

    private By registrationInvalidEmail(){return MobileBy.className("android.widget.TextView");}



    @Step
    public void clickLinkRegister(){
        onClick(registerLink());
    }
    @Step
    public void inputNameRegister(String name){
        onType(nameFieldInRegister(), name);
    }

    @Step
    public void inputEmailRegister(String email){
        onType(emailFieldInRegister(), email);
    }

    @Step
    public void inputPasswordRegister(String password){
        onType(passwordFieldInRegister(), password);
    }

    @Step
    public void inputConfirmPasswordRegister(String confirmPassword){
        onType(confirmPasswordFieldInRegister(), confirmPassword);
    }

    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }

    @Step
    public String getRegistrationSuccessful(){
        return waitUntilVisible(registrationSuccessful()).getText();
    }

    @Step
    public String getErrorMessageRegistrationEmptyName(){
        return waitUntilVisible(registrationEmptyName()).getText();
    }

    @Step
    public String getErrorMessageRegistrationConfirmPassworWrong(){
        return waitUntilVisible(registrationConfirmPasswordWrong()).getText();
    }

    @Step
    public String getErrorMessageRegistrationInvalidEmail(){
        return waitUntilVisible(registrationInvalidEmail()).getText();
    }
}
