package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import util.DriverFactory;

public class LoginPageSteps {

    LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
    HomePage homePage=new HomePage(DriverFactory.getDriver());

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {loginPage.checkLoginPage();
    }

    @Given("Enes is on {string} Page")
    public void enesIsOnPage(String PageName) {
    homePage.checkHomePage();
    homePage.clickLogin(PageName);
    loginPage.checkLoginPage();
    }

    @When("click {string} radio button")
    public void clickRadioButton(String RadioButton) {
        loginPage.clickRadioButton(RadioButton);
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String Title) {
        loginPage.seeTitle(Title);
    }
    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String radioButton) {
        loginPage.seeRadioButton(radioButton);
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String emailText) {
        loginPage.emailTextControl(emailText);
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String passwordText) {
        loginPage.passwordTextControl(passwordText);
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginPage.showPasswordIcon();
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String rememberMe) {
        loginPage.seeRememberMe(rememberMe);
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String forgotPasswordArticle) {
        loginPage.seeForgotPassword(forgotPasswordArticle);
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String loginButton) {
        loginPage.seeLoginButton(loginButton);
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginPage.seeTextBox();
    }

    @When("click login button")
    public void clickLoginButton() {
    loginPage.clickLoginButton();
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String emailEmptyMessage) {
        loginPage.checkEmailEmptyMessage(emailEmptyMessage);
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String passwordEmptyMessage) {
        loginPage.checkPasswordEmptyMessage(passwordEmptyMessage);
    }

    @When("type Email {string}")
    public void typeEmail(String writeMail) {
        loginPage.writeEmail(writeMail);
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
        loginPage.notSeeEmailEmpty();
    }

    @When("type Password {string}")
    public void typePassword(String writePassword) {
        loginPage.writePassword(writePassword);
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        loginPage.notSeePasswordEmpty();
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String wrongMail) {
        loginPage.falseMailSend(wrongMail);
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String falseEmailMessage) {
    loginPage.falseMailError(falseEmailMessage);
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String EmailSend, String PasswordSend) {
    loginPage.emailSendpasswordSend(EmailSend,PasswordSend);
    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String ErrorMessage) {
        loginPage.ErrorMessage(ErrorMessage);
    }
}
