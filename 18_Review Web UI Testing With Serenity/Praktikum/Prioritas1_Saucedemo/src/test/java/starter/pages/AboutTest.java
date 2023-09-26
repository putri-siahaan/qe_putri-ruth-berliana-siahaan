package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AboutTest extends PageObject {
    private By navbarButton(){
        return By.id("react-burger-menu-btn");
    }

    private By aboutMenu(){
        return By.id("about_sidebar_link");
    }

    private By cookieNotice(){
        return By.id("onetrust-accept-btn-handler");
    }

    @Step
    public void clickNavbarButton(){
        $(navbarButton()).click();
    }

    @Step
    public void clickAboutMenu(){
        $(aboutMenu()).click();
    }

    @Step
    public void clickCookieNotice(){
        $(cookieNotice()).click();
    }


}
