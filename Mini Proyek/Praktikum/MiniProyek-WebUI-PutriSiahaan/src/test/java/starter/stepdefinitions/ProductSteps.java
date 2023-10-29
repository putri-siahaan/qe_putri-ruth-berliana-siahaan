package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Logout;
import starter.pages.Product;
import starter.pages.Register;

public class ProductSteps {

    @Steps
    Register register;

    @Steps
    Login login;

    @Steps
    Logout logout;

    @Steps
    Product product;



    //TC_Product_1 [Positive]

    @When("I click the DETAIL button of the selected product")
    public void iClickTheDETAILButtonOfTheSelectedProduct() {

        product.clickTheDetailButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("validate success to display the detail of the product")
    public void validateSuccessToDisplayTheDetailOfTheProduct() {
        product.validateSuccessToDisplayDetailButton();
    }




    //TC_Product_2 [Positive]

    @When("I click select category bar")
    public void iClickSelectCategoryBar() {
        product.clickSelectCategoryBar();
    }

    @And("I choose the desired category for example gaming category")
    public void iChooseTheDesiredCategoryForExampleGamingCategory() {
        product.chooseTheGamingCategory();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Validate success displayed products in the gaming category")
    public void validateSuccessDisplayedProductsInTheGamingCategory() {
        product.validateSuccessDisplayedProductsForGamingCategory();
    }




    //TC_Product_3 [Positive]

    @And("I click clear category")
    public void iClickClearCategory() {
        product.clickClearCategory();
    }

    @Then("Validate success to clear category")
    public void validateSuccessToClearCategory() {
        product.successToClearCategory();
    }



    //TC_Product_4 [Positive]

    @When("I click the BELI button of the selected product")
    public void iClickTheBELIButtonOfTheSelectedProduct() {
        product.clickBeliButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("validate success to add the product in the cart")
    public void validateSuccessToAddTheProductInTheCart() {
        product.clickCartMenu();
        product.validateSuccessAddTheProductInTheCart();
    }




    //TC_Product_5 [Positive]

    @Given("I am on the home page Altashop but i did not login")
    public void iAmOnTheHomePageAltashopButIDidNotLogin() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        register.openAltaShopePage();
    }






    //TC_Product_6 [Positive]

    @When("I go to Cart menu")
    public void iGoToCartMenu() {
        product.clickCartMenu();
    }

    @And("I am adding product in cart page by click the positive button on the quantity of the products")
    public void iAmAddingProductInCartPageByClickThePositiveButtonOnTheQuantityOfTheProducts() {
        product.clickPositiveButtonInTheCart();
    }

    @Then("validate success add the product according to what the user wants to buy")
    public void validateSuccessAddTheProductAccordingToWhatTheUserWantsToBuy() {
        product.validateSuccessAddProductBecauseClickPositiveButton();
    }





    //TC_Product_7 [Positive]
    @And("I am remove product in the cart page by click the minus button on the quantity of the products")
    public void iAmRemoveProductInTheCartPageByClickTheMinusButtonOnTheQuantityOfTheProducts() {
        product.clickMinusButtonInTheCart();
    }

    @Then("validate success remove the product")
    public void validateSuccessRemoveTheProduct() {
        product.validateSuccessRemovingProductBecauseClickPositiveButton();
    }





    //TC_Product_8 [Positive]

    @And("I click transaction in the option of user icon")
    public void iClickTransactionInTheOptionOfUserIcon() {
        product.clickTransactionOption();
    }

    @Then("Validate success on the transaction page")
    public void validateSuccessOnTheTransactionPage() {
        product.validateInTheTransactionPages();
    }




    //TC_Product_9 [Negative]

    @And("I click cart icon")
    public void iClickCartIcon() {
        product.clickCartMenu();
    }

    @And("I click BAYAR button")
    public void iClickBAYARButton() {
        product.clickBayarButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Validate failed to display transaction and {string}")
    public void validateFailedToDisplayTransactionAndBackToLoginPage(String backToMenuLogin) {
        register.validateSuccessRegister();
        register.validateBackToMenuLogin(backToMenuLogin);
    }




    //TC_Product_10 [Positive]

    @Then("Validate success to display the transaction")
    public void validateSuccessToDisplayTheTransaction() {
        product.validateInTheTransactionPages();
    }




    //TC_Product_11 [Positive]
    @And("I click stars to give a rating for the product")
    public void iClickStarsToGiveARatingForTheProduct() {
        product.clickStarForRatingProduct();
    }

    @Then("validate success to give rating of the product")
    public void validateSuccessToGiveRatingOfTheProduct() {
        product.validateSuccessToGiveRatingOfProduct();
    }




    //TC_Product_12 [Positive]

    @Then("validate failed to give a rating and back to login page")
    public void validateFailedToGiveARatingAnd() {
        product.validateFailedToGiveRatingOfProduct();
    }
}
