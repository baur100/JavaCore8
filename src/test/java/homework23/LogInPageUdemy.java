package homework23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPageUdemy {
    private WebDriver driver;
    private WebDriverWait wait;

    public LogInPageUdemy(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver,10,200);
    }
    private WebElement getEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector("[type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("#submit-id-submit"));
    }
    public void open(){

        driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");
    }

    public MainPageUdemy login(String user, String password) {
        getEmailField().sendKeys(user);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPageUdemy(driver);
    }
//
//    public boolean isError() {
//        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
//            return true;
//        } catch (TimeoutException xx){
//            return false;
//        }
//    }
}
