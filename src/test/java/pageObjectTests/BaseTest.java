package pageObjectTests;

import enums.BrowserType;
import helper_1.BrowserFabric_1;
import helper_1.ScreenShot_1;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
        driver = BrowserFabric_1.getDriver(BrowserType.CHROME);
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException {
//        Thread.sleep(3000);
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            ScreenShot_1.capture(driver,iTestResult.getName());
        }
        driver.quit();
    }
}
