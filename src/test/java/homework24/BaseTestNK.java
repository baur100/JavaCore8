package homework24;

import enums.BrowserType;
import helper.BrowserFabric;
import helper.ScreenShot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestNK {
    protected WebDriver driver;
    protected String userName;
    protected String password;

    @Parameters({"username", "password"})
    @BeforeMethod
    public void startUp(String email,String pwd) {
        userName = email;
        password = pwd;
//        System.setProperty("webdriver.gecko.driver","geckodriver");
//        driver = new FirefoxDriver();
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
//        System.setProperty("webdriver.opera.driver","operadriver");
//        driver = new OperaDriver();
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
