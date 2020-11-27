package SimpleTest_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KoelLogin_1 {
    @Test
    public void loginToApp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");

        driver.get("https://koelapp.testpro.io/");
//        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));

        email.sendKeys("testpro.user03@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(3000);

//        List<WebElement> list = new ArrayList<>();
 //       list = driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));

//        Assert.assertFalse(list.size()==0);
    }

    @Test
    public void login_ToKoel_WrongCredentials() throws InterruptedException {
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);

//        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[contains(@type,'subm')]"));
//        WebElement loginButton = driver.findElement(By.cssSelector("[type~='subm']"));

        email.sendKeys("testpro.user03@testpro.io");
        password.sendKeys("0te$t$tudent");
        loginButton.click();

        Thread.sleep(3000);

 //       List<WebElement> listOfErrors = new ArrayList<>();
//        listOfErrors = driver.findElements(By.cssSelector(".error"));
//        Assert.assertEquals(listOfErrors.size(),1);
    }
}
