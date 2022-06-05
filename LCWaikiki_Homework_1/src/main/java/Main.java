import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args){
        //Setup chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //window maximize
        driver.manage().window().maximize();
        //Enters the site
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        //click login
        driver.findElement(By.cssSelector("span.dropdown-label")).click();
        //click signup
        driver.findElement(By.cssSelector("a.login-form__link")).click();


        // be login

        //write e-mail
        driver.findElement(By.cssSelector(".input-text :nth-child(3)")).sendKeys("yanlisemail");
        //write password
        driver.findElement(By.cssSelector(".input-text :nth-child(5)")).sendKeys("123456");
       //wait 1 seconds
        try {
            Thread.sleep(1000); //wait 1 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       //find error message
       String warning =driver.findElement(By.cssSelector(".field-validation-error #RegisterFormView_RegisterEmail-error")).getText();
        //wait 1 seconds
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       //Write error message
        System.out.println(warning);

        //driver close
        driver.close();
    }
}
