package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LoginPageLocators.emailCssSelector)));
        return driver.findElement(By.cssSelector(LoginPageLocators.emailCssSelector));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector(LoginPageLocators.passwordCssSelector));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector(LoginPageLocators.loginButtonCssSelector));
    }
    public void open(){

        driver.get("https://koelapp.testpro.io/");
    }

    public MainPage login(String user, String password) {
        getEmailField().sendKeys(user);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }

    public boolean isError() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
            return true;
        } catch (TimeoutException xx){
            return false;
        }
    }
}
