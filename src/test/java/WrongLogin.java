import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WrongLogin {
    @Test
    public void wrongloginToApp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(1000);

        WebElement email = driver.findElement(new By.ByCssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector(" [type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("WrongPassword");
        loginButton.click();
        try{
            WebElement homeIcon=driver.findElement(By.cssSelector(".home"));
            Assert.assertTrue(false);
        }catch (NoSuchElementException xx){
            Assert.assertTrue(false,"Home page not found");
        }
        Thread.sleep(3000);
        driver.quit();
    }
    }

