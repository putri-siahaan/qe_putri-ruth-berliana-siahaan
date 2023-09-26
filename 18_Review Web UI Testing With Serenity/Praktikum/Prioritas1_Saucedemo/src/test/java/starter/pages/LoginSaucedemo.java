package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginSaucedemo extends PageObject {
    private By usernameField(){
        return By.id("user-name");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login-button");
    }

    private By title(){
        return By.className("title");
    }

    private By errorMessageLockedOut(){ return By.xpath("//h3[@data-test='error']"); }
    @Step
    public void openLoginPage(){
        open();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public void validateHomePage(){
        $(title()).isDisplayed();
    }

    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessageLockedOut()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String errorMessage){
        return $(errorMessageLockedOut()).getText().equalsIgnoreCase(errorMessage);
    }
}

