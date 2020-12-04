package SimpleTestMM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LoginKoel1 {
private WebDriver driver;
@BeforeMethod
    public void startUp() throws InterruptedException {
    System.setProperty("webdriver.chrome.drive","chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://koelapp.testpro.io/");
    Thread.sleep(2000);
}
@AfterMethod
    public void tearDown() throws InterruptedException {
    Thread.sleep(2000);
    driver.quit();
}
@Test
        public void loginToApp() throws InterruptedException {
    //Act
    WebElement email = driver.findElement(By.cssSelector("[type='email']"));
    WebElement password = driver.findElement(By.cssSelector("[type='password']"));
    WebElement loginButton = driver.findElement(By.cssSelector("button"));

    email.sendKeys("koeluser86@testpro.io");
    password.sendKeys("papapapa");
    loginButton.click();
    Thread.sleep(2000);
    //Assert
    List<WebElement> list = driver.findElements(By.cssSelector(".error"));
    Assert.assertEquals(list.size(),1);


}

}
