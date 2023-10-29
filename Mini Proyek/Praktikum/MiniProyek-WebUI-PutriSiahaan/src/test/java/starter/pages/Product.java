package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Product extends PageObject {

    private By detailButton(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[2]/div/div[3]/div[2]/button[1]");
    }

    private By validateDetailOfProduct(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/p[1]");
    }

    private By selectCategoryBar(){
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[1]/div[1]");
    }

    private By gamingCategory(){
        return By.xpath("/html/body/div/div[2]/div/div[1]/div/div");
    }

    private By validateProductOfGamingCategory(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div");
    }

    private By clearCategory(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[2]/div/button");
    }

    private By validateOnTheHomepageAltaShop(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[6]/div");
    }

    private By beliButton(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[2]/div/div[3]/div[2]/button[2]");
    }

    private By successToAddTheProductInTheCart(){
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[1]");
    }

    private By cartMenu(){
        return By.xpath("/html/body/div/div/header/div/button[1]");
    }

    private By positiveButtonInTheCart(){
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[2]/button[2]");
    }

    private By validateSuccessAddProductBecauseClickPositiveButtonInTheCart(){
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[2]/div[2]");
    }

    private By minusButtonInTheCart(){
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[2]/button[1]");
    }

    private By validateSuccessRemoveProductBecauseClickPositiveButtonInTheCart(){
        return By.xpath("/html/body/div/div/main/div/div");
    }

    private By transactionOption() {
        return By.xpath("//*[@class='v-list v-sheet theme--light']//*[contains(text(), 'Transaksi')]");
    }

    private By validateInTheTransactionPage(){
        return By.xpath("/html/body/div/div[1]/main/div/div");
    }

    private By bayarButton(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/button");
    }

    private By starForRatingProduct(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/button[5]");
    }

    private By failedGiveRatingAndBackToLoginPage(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button/span");
    }


    //TC_Product_1 [Positive]
    @Step
    public void clickTheDetailButton(){$(detailButton()).click();
    }

    @Step
    public void validateSuccessToDisplayDetailButton(){$(validateDetailOfProduct()).isDisplayed();
    }




    //TC_Product_2 [Positive]
    @Step
    public void clickSelectCategoryBar(){$(selectCategoryBar()).click();
    }

    @Step
    public void chooseTheGamingCategory(){$(gamingCategory()).click();
    }

    @Step
    public void validateSuccessDisplayedProductsForGamingCategory(){$(validateProductOfGamingCategory()).click();
    }




    //TC_Product_3 [Positive]
    @Step
    public void clickClearCategory(){$(clearCategory()).click();
    }

    @Step
    public void successToClearCategory(){$(validateOnTheHomepageAltaShop()).click();
    }





    //TC_Product_4 [Positive]

    @Step
    public void clickBeliButton(){$(beliButton()).click();
    }

    @Step
    public void validateSuccessAddTheProductInTheCart(){$(successToAddTheProductInTheCart()).click();
    }



    //TC_Product_6 [Positive]
    @Step
    public void clickCartMenu(){$(cartMenu()).click();
    }

    @Step
    public void clickPositiveButtonInTheCart(){$(positiveButtonInTheCart()).click();
    }

    @Step
    public void validateSuccessAddProductBecauseClickPositiveButton(){$(validateSuccessAddProductBecauseClickPositiveButtonInTheCart()).click();
    }





    //TC_Product_7 [Positive]

    @Step
    public void clickMinusButtonInTheCart(){$(minusButtonInTheCart()).click();
    }

    @Step
    public void validateSuccessRemovingProductBecauseClickPositiveButton(){$(validateSuccessRemoveProductBecauseClickPositiveButtonInTheCart()).click();
    }






    //TC_Product_8 [Positive]

    @Step
    public void clickTransactionOption() {
        $(transactionOption()).click();
    }

    @Step
    public void validateInTheTransactionPages(){$(validateInTheTransactionPage()).click();
    }




    //TC_Product_10 [Positive]

    @Step
    public void clickBayarButton(){$(bayarButton()).click();
    }





    //TC_Product_11 [Positive]
    @Step
    public void clickStarForRatingProduct(){$(starForRatingProduct()).click();
    }

    @Step
    public void validateSuccessToGiveRatingOfProduct(){$(validateDetailOfProduct()).isDisplayed();
    }




    //TC_Product_12 [Positive]
    @Step
    public void validateFailedToGiveRatingOfProduct(){$(failedGiveRatingAndBackToLoginPage()).click();
    }



























































}
