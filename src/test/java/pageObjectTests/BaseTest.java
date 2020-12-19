package pageObjectTests;

import enums.BrowserType;
import helper.BrowserFabric;
import helper.ScreenShot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String userName;
    protected String password;

    @Parameters({"username", "password", "browser"})
    @BeforeMethod
    public void startUp(String email,String pwd, String browser) {
        userName = email;
        password = pwd;
        BrowserType browserType = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.FIREFOX;
        driver = BrowserFabric.getDriver(browserType);
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException {
//        Thread.sleep(3000);
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            ScreenShot.capture(driver,iTestResult.getName());
        }
        driver.quit();
    }
}
