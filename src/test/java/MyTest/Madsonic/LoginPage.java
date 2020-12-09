package MyTest.Madsonic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void simpleTest_ClickElephant_PageOpened() throws InterruptedException {

        driver.get("https://butuzz.com/");
        driver.manage().window().maximize();
        Thread.sleep(6000);

        //Act
        WebElement about_me = driver.findElement(By.cssSelector("#\\35 026674 > a"));
        about_me.click();
        String title = driver.getTitle();
        Thread.sleep(10000);

        WebElement portfolio = driver.findElement(By.cssSelector("#\\35 051040 > a"));
        portfolio.click();
        String title_1 = driver.getTitle();
        Thread.sleep(2000);

        WebElement portfolio_weddStory = driver.findElement(By.cssSelector("#sub-5051040 > ul > li:nth-child(1) > a"));
        portfolio_weddStory.click();
        String title_2 = driver.getTitle();
        Thread.sleep(30000);

        WebElement element = driver.findElement(By.cssSelector("#w_43303049 > div > p > a > span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();


        WebElement price = driver.findElement(By.xpath("//*[@id=\"4489427\"]/a"));
        price.click();
        String title_3 = driver.getTitle();
        Thread.sleep(6000);

        WebElement contacts = driver.findElement(By.cssSelector("#\\34 489394 > a"));
        contacts.click();
        String title_4 = driver.getTitle();
        Thread.sleep(5000);

        WebElement main_menu = driver.findElement(By.cssSelector("#\\34 489388 > a"));
        main_menu.click();
        String title_5 = driver.getTitle();
        Thread.sleep(5000);


        WebElement thank_for_your_visit = driver.findElement(By.cssSelector("#w_54310063 > div > p:nth-child(1)"));
        thank_for_your_visit.click();
        String title_6 = driver.getTitle();
        Thread.sleep(6000);

        //Assert
  //      Assert.assertEquals(title, "\"Свадебный фотограф в Москве Красицкий Михаил\"");
    }
}
