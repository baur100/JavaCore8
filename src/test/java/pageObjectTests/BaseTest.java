package pageObjectTests;

import enums.BrowserType;
import helper.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String userName;
    protected String password;

    @Parameters({"username", "password"})
    @BeforeMethod
    public void startUp(String email,String pwd) {
        userName = email;
        password = pwd;
        driver = BrowserFabric.getDriver(BrowserType.FIREFOX);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
//        Thread.sleep(3000);
        driver.quit();
    }
}
