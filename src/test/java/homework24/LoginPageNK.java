package homework24;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageNK extends BasePageNK{
    public LoginPageNK(WebDriver driver) {
        super(driver);
    }
    private WebElement getEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LoginPageLocatorsNK.emailCssSelector)));
        return driver.findElement(By.cssSelector(LoginPageLocatorsNK.emailCssSelector));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector(LoginPageLocatorsNK.passwordCssSelector));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector(LoginPageLocatorsNK.loginButtonCssSelector));
    }
    public void open(){
        driver.get("https://koelapp.testpro.io/");
    }
    public MainPageNK login(String user, String password) {
        getEmailField().sendKeys(user);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPageNK(driver);
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
