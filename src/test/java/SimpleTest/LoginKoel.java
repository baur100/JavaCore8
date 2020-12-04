package SimpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginKoel {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10,100);
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginToApp(){
        // Act
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        fluentWait.until(x->x.findElement(By.cssSelector("[type='email']")).isDisplayed());
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        // Assert
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        fluentWait.until(x->x.findElement(By.cssSelector(".home")).isDisplayed());
        List<WebElement> list = driver.findElements(By.cssSelector(".home"));
        Assert.assertEquals(list.size(),1);
    }
    @Test
    public void wrongLoginToApp(){

        // Act
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("WrongPassword");
        loginButton.click();
        // Assert
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
        List<WebElement> list = driver.findElements(By.cssSelector(".error"));
        Assert.assertEquals(list.size(),1);
    }
}