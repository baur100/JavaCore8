package helper;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class BrowserFabric {
    public static WebDriver getDriver(BrowserType type){
        switch (type){
            case EDGE:
                return getEdgeDriver();
            case OPERA:
                return getOperaDriver();
            case FIREFOX:
                return getFirefoxDriver();
            default:
                return getChromeDriver();
        }
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
//        options.addArguments("--headless");
//        options.addArguments("--auto-open-devtools-for-tabs");
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        return new FirefoxDriver(options);
    }

    private static WebDriver getOperaDriver() {
        WebDriverManager.operadriver().setup();
        OperaOptions options = new OperaOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        return new OperaDriver();
    }

    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
