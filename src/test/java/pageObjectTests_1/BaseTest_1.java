package pageObjectTests_1;

import enums.BrowserType;
import helper_1.BrowserFabric_1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_1 {
    protected WebDriver driver;
    @BeforeMethod
    public void startUp() {
        driver = BrowserFabric_1.getDriver(BrowserType.FIREFOX);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
