package SimpleTestMM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class playlist {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 100);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void loginToApp() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[autofocus='autofocus']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        WebElement plus = driver.findElement(By.cssSelector("[class='fa fa-plus-circle control create']"));
        WebElement space = driver.findElement(By.cssSelector("[placeholder='↵ to save']"));
        WebElement enter = driver.findElement(By.id("Value"));

        email.sendKeys("koeluser86@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        plus.click();
        space.sendKeys("Aurash");
        enter.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='#!/favorites']")));
        driver.findElement(By.cssSelector("[href='#!/favorites']"));
    }
}
