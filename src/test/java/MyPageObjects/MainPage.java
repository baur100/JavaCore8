package MyPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10, 200);

    }
    public boolean isMainPage(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
            return true;
        } catch (Exception xx){
            return false;
        }

    }

    public void createPlayList(String name) {
        
    }
}
