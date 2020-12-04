package simpleTest;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class PlayList {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void playlistNadya(){
//        Act
        fluentWait.until(x->x.findElement(By.cssSelector("[type='email']")).isDisplayed());
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        fluentWait.until(x->x.findElement(By.xpath("//i[@class=\"fa fa-plus-circle control create\"]")).isDisplayed());
        WebElement plusCircle= driver.findElement(By.xpath("//i[@class=\"fa fa-plus-circle control create\"]"));
        plusCircle.click();

        WebElement placeholder = driver.findElement(By.xpath("//*[@class='create']/input[@type='text']"));
        placeholder.sendKeys("NadyaPlaylist");

        placeholder.sendKeys(Keys.ENTER);

//        Assert

        fluentWait.until(x->x.findElements(By.xpath("/*[@id=\"playlists\"]//li")));
        List<WebElement> playlist = driver.findElements(By.xpath("/*[@id=\"playlists\"]//li"));
        playlist.contains("NadyaPlaylist");
    }

}
