package Helper;

import enums.BrowsersType;
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
    public static WebDriver getDriver(BrowsersType type) throws NoSuchMethodException {
        switch (type) {
            case EDGE:
                return getEdgeDriver();
            case OPERA:
                return getOperaDriver();
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            default:
                return getChromeDriver();

        }
    }
    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width = 1400");
        options.addArguments("--height = 1000");
        System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window size = 1400,1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver(options);
    }

    private static WebDriver getOperaDriver() {
        OperaOptions options = new OperaOptions();
        options.addArguments("window size = 1400,1000");
        System.setProperty("webdriver.opera.driver", "operadriver.exe");
        return new OperaDriver(options);
    }

    private static WebDriver getEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
        return new EdgeDriver(options);
    }
}



