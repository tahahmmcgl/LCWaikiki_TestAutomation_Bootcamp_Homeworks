package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By homepageitem=By.cssSelector("svg.abc");
    By searchboxtext=By.cssSelector("input.search-form__input-field__search-input");
    By searchbtn=By.cssSelector(".search-form__input-field__btn-search.false");
    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
        this.elementHelper = new ElementHelper(this.driver);
    }


    public void checkHomePage(){
        elementHelper.presenceElement(homepageitem);
    }
    public void writeSearchBox(String item){
        elementHelper.sendKey(searchboxtext,item);
    }
    public void clickSearch(){
        elementHelper.click(searchbtn);
    }

}

