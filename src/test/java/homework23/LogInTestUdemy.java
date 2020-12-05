package homework23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LogInTestUdemy {
    private WebDriver driver;
    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void loginToTheSite(){
        LogInPageUdemy logInPageUdemy = new LogInPageUdemy(driver);
        logInPageUdemy.open();
        MainPageUdemy mainPageUdemy = logInPageUdemy.login("nadezhdakolt@gmail.com","nadezhdaudemy2020");
        Assert.assertTrue(mainPageUdemy.isMainPage());
    }
//    @Test
//    public void wrongLogin(){
//        // Arrange
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        // Act
//        loginPage.login("koeluser06@testpro.io","WrongPassword");
//        // Assert
//        Assert.assertTrue(loginPage.isError());
//    }
}
