package pageObjects_1;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.MainPage;

public class LoginPage_1 {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage_1(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver,10,200);
    }
    private WebElement getEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LoginPageLocators_1.emailCssSelector)));
        return driver.findElement(By.cssSelector("[type='email']"));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector(LoginPageLocators_1.passwordCssSelector));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector(LoginPageLocators_1.loginButtonCssSelector));
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
