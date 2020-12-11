package MyPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
//fluentWait.until(x->x.findElement(By.cssSelector("[type='email']")).isDisplayed());
//WebElement email = driver.findElement(By.cssSelector("[type='email']"));
//WebElement password = driver.findElement(By.cssSelector("[type='password']"));
//WebElement loginButton = driver.findElement(By.cssSelector("button"));

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver,10, 200);
    }
    private WebElement getEmailfield(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }

    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector("[type='password']"));

    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button"));
    }

    public void open(){
        driver.get("https://koelapp.testpro.io/");
    }

    public void login(String user, String password) {


    }
}
