package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import util.DriverFactory;

public class ProductPageStep {

    ProductPage productPage=new ProductPage(DriverFactory.getDriver());

    @When("Check Product Page")
    public void checkProductPage() {
        productPage.checkProductPage();
    }

    @When("Select {string} size")
    public void selectSize(String size) {
        productPage.sizeSelect(size);
    }

    @When("Click {string} button")
    public void clickButton(String btn) {
        productPage.clickBtn(btn);
    }

    @Then("See added product in basket count {string}")
    public void seeAddedProductInBasketCount(String num) {
        productPage.checkNum(num);
    }
}
