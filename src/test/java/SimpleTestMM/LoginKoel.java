package SimpleTestMM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginKoel {
    // [type='email']
    // [type='password']
    // button
    // .home
    @Test
    public void loginToApp() throws InterruptedException {
  //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(3000);
 //Act
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type = 'password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(3000);
//Assert
        try{
            WebElement homeIcon = driver.findElement(By.cssSelector(".home"));
            Assert.assertTrue(true);
        } catch (NoSuchElementException xx){
            Assert.assertTrue(false,"Home element not found");

        }
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void wrongLoginToApp() throws InterruptedException{
  //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);
 //Act
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type= 'password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("jhgdffdh");
        loginButton.click();
        Thread.sleep(3000);
 //Assert
        try{
            driver.findElement(By.cssSelector(".error"));
            Assert.assertTrue(true);
        } catch (NoSuchElementException xx){
            Assert.assertTrue(false,"Error not found");
        }

        Thread.sleep(3000);
        driver.quit();
    }

}
