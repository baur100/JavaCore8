package SimpleTestMM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
    public void createPlayList() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[autofocus='autofocus']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type = 'password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        email.sendKeys("koeluser86@testpro.io");
        password.sendKeys("te$t$tudent");
        Thread.sleep(5000);
        loginButton.click();
        Actions action = new Actions(driver);
        WebElement plus = driver.findElement(By.xpath("//*[@id=\"playlists\"]/h1/i"));
        action.moveToElement(plus).build().perform();
        action.moveToElement(plus).click().perform();
        WebElement space = driver.findElement(By.xpath("//*[@class='create']/input[@type='text']"));

//        plus.click();
//        space.sendKeys("Aurash");
//        space.sendKeys(Keys.ENTER);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='#!/favorites']")));
//        driver.findElement(By.cssSelector("[href='#!/favorites']"));
    }
}
