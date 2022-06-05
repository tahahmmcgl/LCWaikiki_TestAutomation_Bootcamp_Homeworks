package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;



public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By loginPageSign = By.cssSelector("h5.login-form__title");
    By RadioButtonsText = By.cssSelector(".login-form__radio-buttons span");
    By Title = By.cssSelector(".login-form .login-form__title");
    By mailText = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[2]/input");
    By passwordText = By.cssSelector(".login-form__password .text-input");
    By showPasswordIcn=By.cssSelector("img.login-form__show-password-icon--img");
    By rememberMeArticle=By.cssSelector(".checkbox-span");
    By forgotPassword=By.cssSelector("a.login-form__forgot-password-link");
    By loginArticle=By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By phoneTextBox=By.cssSelector(".login-form__phone.text-input");
    By loginButton=By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By emailEmpty=By.cssSelector("div.error");
    By passwordEmpty=By.cssSelector(".login-form__password div.error");
    By emailAndPasswordError=By.cssSelector("p.login-form__header-errors--p");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkLoginPage() {
        elementHelper.checkElementPresence(loginPageSign);
    }

    public void clickRadioButton(String ButtonName) {
        elementHelper.clickElementWithText(RadioButtonsText, ButtonName);
    }
    public void seeTitle(String TitleName) {
        elementHelper.findElement(Title).getText().contains(TitleName);
    }

    public void seeRadioButton(String radioButtonName) {
        elementHelper.checkElementWithText(RadioButtonsText, radioButtonName);
    }

    public void emailTextControl(String Email) {
        elementHelper.getAttribute(mailText,"placeholder").equals(Email);
    }

    public void passwordTextControl(String PasswordText) {
        elementHelper.getAttribute(passwordText,"placeholder").equals(PasswordText);
    }
    public void showPasswordIcon(){
        elementHelper.checkElementPresence(showPasswordIcn);
    }
    public void seeRememberMe(String rememberMe){
        elementHelper.getText(rememberMeArticle).equals(rememberMe);
    }
    public void seeForgotPassword(String forgotPasswordArticle){
        elementHelper.checkElementText(forgotPassword,forgotPasswordArticle);
    }
    public void seeLoginButton(String loginButton){
        elementHelper.checkElementText(loginArticle,loginButton);
    }
    public void seeTextBox(){
    elementHelper.checkElementPresence(phoneTextBox);
    }
    public void clickLoginButton(){
        elementHelper.checkElementPresence(loginButton);
        elementHelper.click(loginButton);
    }
    public void checkEmailEmptyMessage(String emailEmptyMessage){
        elementHelper.checkElementText(emailEmpty,emailEmptyMessage);
    }
    public void checkPasswordEmptyMessage(String passwordEmptyMessage){
        elementHelper.checkElementText(passwordEmpty,passwordEmptyMessage);
    }
    public void writeEmail(String email){
        elementHelper.sendKey(mailText,email);
    }
    public void notSeeEmailEmpty(){
        Boolean girdi=true;
        if(driver.findElement(emailEmpty).isDisplayed()==true){
            girdi=false;
        }
        Assert.assertEquals(girdi,false);    }
    public void writePassword(String writePassword){
        elementHelper.checkElementPresence(passwordText);
        elementHelper.sendKey(passwordText,writePassword);
    }
    public void notSeePasswordEmpty(){
        Boolean girdi=true;
        if(driver.findElement(passwordEmpty).isDisplayed()==true){
            girdi=false;
      }
        Assert.assertEquals(girdi,false);
    }
    public void falseMailSend(String wrongMail){
        elementHelper.sendKey(mailText,wrongMail);
        elementHelper.click(loginButton);
    }
    public void falseMailError(String falseMessage){
        elementHelper.checkElementText(emailEmpty,falseMessage);
    }
    public void emailSendpasswordSend(String EmailSend,String PasswordSend){
        elementHelper.sendKey(mailText,EmailSend);
        elementHelper.sendKey(passwordText,PasswordSend);
        elementHelper.click(loginButton);
    }
    public void ErrorMessage(String error){
        elementHelper.checkElementText(emailAndPasswordError,error);
    }
}