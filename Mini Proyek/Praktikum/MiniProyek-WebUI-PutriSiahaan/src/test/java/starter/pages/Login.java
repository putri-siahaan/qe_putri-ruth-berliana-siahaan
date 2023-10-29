package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {

    private By emailFieldForLogin(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }

    private By passwordFieldForLogin(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    private By loginButton(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button/span");
    }

    private By successLogin(){
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[1]/label");
    }

    private By failedLogin(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div");
    }




    //TC_Login_1 [Positive]

    @Step
    public void inputValidEmail(String validEmail){$(emailFieldForLogin()).type(validEmail);
    }

    @Step
    public void inputValidPassword(String validPassword){$(passwordFieldForLogin()).type(validPassword);
    }

    @Step
    public void clickLoginButton(){$(loginButton()).click();
    }

    @Step
    public void validateSuccessLogin() {
        $(successLogin()).isDisplayed();
    }

    @Step
    public boolean validatetoHomePageAltaShop(String homepageAltaShop){
        return $(successLogin()).getText().equalsIgnoreCase(homepageAltaShop);
    }







    //TC_Login_2 [Negative 1]
    @Step
    public void inputInvalidEmail(String invalidEmail){$(emailFieldForLogin()).type(invalidEmail);
    }

    @Step
    public void validateSFailedLoginBecauseInvalidEmail() {
        $(failedLogin()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessageLogin(String errorMessageLogin){
        return $(failedLogin()).getText().equalsIgnoreCase(errorMessageLogin);
    }




    //TC_Login_3 [Negative 2]
    @Step
    public void inputInvalidPassword(String invalidPassword){$(passwordFieldForLogin()).type(invalidPassword);
    }

}
