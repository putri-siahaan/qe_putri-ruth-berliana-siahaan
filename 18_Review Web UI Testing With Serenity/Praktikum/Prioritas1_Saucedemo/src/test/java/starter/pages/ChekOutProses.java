package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChekOutProses extends PageObject {

    private By addToCart(){
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    private By cartButton(){
        return By.className("shopping_cart_link");
    }

    private By checkoutButton() { return By.id("checkout");}

    private By firstNameField(){
        return By.id("first-name");
    }

    private By lastNameField(){
        return By.id("last-name");
    }

    private By postalCodeField(){
        return By.id("postal-code");
    }

    private By continueButton() { return By.id("continue");}

    private By finishButton() { return By.id("finish");}

    private By chekoutComplete(){ return By.className("title"); }

    private By errorMessage(){ return By.xpath("//h3[@data-test='error']"); }

    @Step
    public void clickAddToCart(){
        $(addToCart()).click();
    }

    @Step
    public void clickCartButton(){
        $(cartButton()).click();
    }

    @Step
    public void clickCheckoutButton(){
        $(checkoutButton()).click();
    }

    @Step
    public void inputFirstName(String firstName){
        $(firstNameField()).type(firstName);
    }

    @Step
    public void inputLastName(String lastName){
        $(lastNameField()).type(lastName);
    }

    @Step
    public void inputPostalCode(String postalCode){
        $(postalCodeField()).type(postalCode);
    }

    @Step
    public void clickContinueButton(){
        $(continueButton()).click();
    }

    @Step
    public void clickFinishButton(){
        $(finishButton()).click();
    }

    @Step
    public boolean checkoutComplateDisplayed(){
        return $(chekoutComplete()).isDisplayed();
    }

    @Step
    public boolean validateEqualCheckoutComplated(String successMessage){
        return $(chekoutComplete()).getText().equalsIgnoreCase(successMessage);
    }

    //Case Negative
    @Step
    public boolean errorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String errorMessage){
        return $(errorMessage()).getText().equalsIgnoreCase(errorMessage);
    }

}
