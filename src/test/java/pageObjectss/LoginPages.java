package pageObjectss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class LoginPages {
    private WebDriver driver;
    private WebDriver wait;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
        wait = (WebDriver) new WebDriverWait(this.driver, 10, 200);
    }
}
