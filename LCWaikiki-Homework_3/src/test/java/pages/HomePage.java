package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By delivery = By.cssSelector(".fast-delivery");
    By loginCard = By.cssSelector(".user-wrapper .cart-dropdown  .dropdown-label");

    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void clickLogin(String card){
        elementHelper.clickElementWithText(loginCard, card);
    }
    public void checkHomePage() {
        elementHelper.checkElementPresence(delivery);
    }



}

