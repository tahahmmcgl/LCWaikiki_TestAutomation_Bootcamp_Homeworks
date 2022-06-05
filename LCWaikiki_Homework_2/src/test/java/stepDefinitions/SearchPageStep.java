package stepDefinitions;

import io.cucumber.java.en.When;
import pages.SearchPage;
import util.DriverFactory;

public class SearchPageStep {

    SearchPage searchPage=new SearchPage(DriverFactory.getDriver());

    @When("check SearchPage")
    public void checkSearchPage() {
        searchPage.checkSearchPage();
    }


    @When("click {string} product item")
    public void clickProductItem(String item) {
        searchPage.clickFirstItem(item);
    }
}
