package SimpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LoginKoel {
    private WebDriver driver;
    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginToApp() throws InterruptedException {
        // Act
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(2000);

        // Assert
        try{
            driver.findElement(By.cssSelector(".home"));
            Assert.assertTrue(true);
        } catch (NoSuchElementException xx){
            Assert.assertTrue(false,"Home element not found");
        }
    }
    @Test
    public void wrongLoginToApp() throws InterruptedException {

        // Act
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("WrongPassword");
        loginButton.click();
        Thread.sleep(1000);
        // Assert

        List<WebElement> list = driver.findElements(By.cssSelector(".error"));
        Assert.assertEquals(list.size(),1);
    }
        // //*[@alt='Headshot Image' and @src='https://s.udemycdn.com/topic-images/lohp-topic-banners/GettyImages-1166389425_opt.jpg']"
        // //[contains(@src,'1166389425')]
        // //*[text()='Learn. Grow. Succeed.']

        // (//*[@alt='Headshot Image'])[1]
        // //*[@class='header--gap-auth-button--7KoL0'])[1]/a/*[text()='Log in']
        // /parent::*
        // (//nav)/following-sibling::*[5]
        //*[@class='header--gap-auth-button--7KoL0'])[1]/preceding-sibling::*[5]
}