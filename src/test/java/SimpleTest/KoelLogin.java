package SimpleTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class KoelLogin {
    private WebDriver driver;

//[type='email']
////[type='password']
////button
//.home

    @Test
    public void loginToApp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");


        driver.close();

    }
}

