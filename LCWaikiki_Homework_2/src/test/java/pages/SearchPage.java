package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By searchPageItem=By.cssSelector("span.product-list-heading__product-count__count");
    By firstItem=By.cssSelector("h5.product-card__title");

    public SearchPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
        this.elementHelper = new ElementHelper(this.driver);
    }
    public void checkSearchPage(){
        elementHelper.presenceElement(searchPageItem);
    }
    public void clickFirstItem(String item){
        elementHelper.clickElementWithText(firstItem,item);
    }


}

