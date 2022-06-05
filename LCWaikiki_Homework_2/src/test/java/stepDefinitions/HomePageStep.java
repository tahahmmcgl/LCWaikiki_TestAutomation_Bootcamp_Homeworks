package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.DriverFactory;


public class HomePageStep {

HomePage homePage=new HomePage(DriverFactory.getDriver());
    @Given("Taha is on Home page")
    public void tahaIsOnHomePage() {
        homePage.checkHomePage();
    }

    @When("write {string} to SearchBox")
    public void writeToSearchBox(String item) {
        homePage.writeSearchBox(item);
    }

    @When("click SearchButton")
    public void clickSearchButton() {
        homePage.clickSearch();
    }
}
