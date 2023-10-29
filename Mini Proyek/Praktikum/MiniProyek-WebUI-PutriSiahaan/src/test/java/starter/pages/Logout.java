package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Logout extends PageObject {

    private By userIcon(){
        return By.xpath("/html/body/div/div/header/div/button[2]");
    }

    private By logoutFromAltaShop(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/div[2]");
    }

    private By successLogout(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[1]");
    }



    //TC_Logout_1 [Positive]

    @Step
    public void clickUserIcon(){$(userIcon()).click();
    }

    @Step
    public void clickLogoutButton(){$(logoutFromAltaShop()).click();
    }

    @Step
    public void validateSuccessLogout() {
        $(successLogout()).isDisplayed();
    }

    @Step
    public boolean validateBackToMenuLogin(String goToMenuLogin){
        return $(successLogout()).getText().equalsIgnoreCase(goToMenuLogin);
    }

}
