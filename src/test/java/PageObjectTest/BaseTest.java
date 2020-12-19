package PageObjectTest;

import Helper.BrowserFabric;
import enums.BrowsersType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String userName;
    protected String password;
    @Parameters ({"userName, password"})


    @BeforeMethod
    public void startUp(String email, String pwd) throws NoSuchMethodException {
        userName = email; //"koeluser06@testpro.io";
        password = pwd; //"te$t$tudent";
        driver = BrowserFabric.getDriver(BrowsersType.CHROME);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
