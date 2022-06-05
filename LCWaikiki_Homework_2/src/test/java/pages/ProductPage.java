package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By  productPageItem=By.cssSelector(".payment-options-panel-title");
    By sizeSelect=By.cssSelector("#option-size > a");
    By addBasketButton=By.cssSelector(".add-to-cart.button-link.add-to-cart-button");
    By basketNumber=By.cssSelector("span.badge-circle");
    public ProductPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
        this.elementHelper = new ElementHelper(this.driver);
    }
    public void checkProductPage(){
        elementHelper.presenceElement(productPageItem);
    }
    public void sizeSelect(String size){
        elementHelper.clickElementWithText(sizeSelect,size);
    }
    public void clickBtn(String btn){
        elementHelper.clickElementWithText(addBasketButton,btn);
    }
    public void checkNum(String num){
        elementHelper.checkElementWithText(basketNumber,num);
    }

}

