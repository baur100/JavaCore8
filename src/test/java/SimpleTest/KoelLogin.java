package SimpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//[type='email']
////[type='password']
////button
//.home
//        Arrange
//
   public class KoelLogin {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeMethod
    public void startUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 100);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io/");

//        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
//        Thread.sleep(3000);
        driver.quit();
    }
        @Test
        public void loginToApp() throws InterruptedException {
//        Act

            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement button = driver.findElement(By.cssSelector("button"));
        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        button.click();

//        Thread.sleep(3000);

//        Assert
        try {
            WebElement homeIcon = driver.findElement(By.cssSelector(".home"));
            Assert.assertTrue(true);
        }catch (NoSuchElementException xx){
            Assert.assertTrue(false, "Home element not found");
        }

//        Thread.sleep(3000);


        driver.quit();

    }

    @Test
    public void wrongLoginToApp() throws InterruptedException {
//        Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");

        Thread.sleep(2000);

//        Act

        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement button = driver.findElement(By.cssSelector("button"));
        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("WrongPassword");
        button.click();


//        Assert
        try {
            WebElement homeIcon = driver.findElement(By.cssSelector(".error"));
            Assert.assertTrue(true);
        }catch (NoSuchElementException xx){
            Assert.assertTrue(false, "Error element not found");
        }
//        Thread.sleep(3000);


        driver.quit();

    }
    @Test
    public void udemy(){
        //"//*[@alt= 'Headshot Image' and @src = 'https://s.udemycdn.com/topic-images/lohp-topic-/GettyImagesbanner-1166389425_opt.jpg
        // " //*[text()='Learn.Grow. Succeed.']
        //"//*[contains(@src, '1166389425')]"
    }

}



