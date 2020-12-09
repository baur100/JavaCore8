package PageObject;

import PageObjects.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver,10,200);
    }
    private WebElement getEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector(LoginPageLocators.emailCssSelector));
       }
    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector(LoginPageLocators.passwordCssSelector));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector(LoginPageLocators.LoginButtonCssSelector));

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

        }catch (Exception xx){
            return false;
        }
    }
}