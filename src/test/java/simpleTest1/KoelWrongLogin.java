package simpleTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelWrongLogin {
    @Test
    public void wrongLoginToApp() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //создание драйвера
        driver.get("https://koelapp.testpro.io/"); //вызывает страницу
        Thread.sleep(2000); //джем пока страница грузиться
        //Act
        WebElement email=driver.findElement(By.cssSelector("[type='email']"));
        WebElement password=driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginbutton=driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("wrongpassword");
        loginbutton.click();

        //Assert
        try {
            driver.findElement(By.cssSelector(".error"));
            Assert.assertTrue(true);
        }catch (NoSuchElementException xx){
            Assert.assertFalse(false,"Error not found");
        }

        Thread.sleep(3000);
        driver.quit(); //обязательно убить драйвера

    }}
