package homework23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageUdemy {
    private WebDriver driver;
    private WebDriverWait wait;
    public MainPageUdemy(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }

    public boolean isMainPage(){
        try {
            driver.findElements(By.cssSelector("user-profile-dropdown--dropdown"));
            return true;
        } catch (Exception xx){
            return false;
        }
    }
}
