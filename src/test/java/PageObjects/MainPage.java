package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10, 200);

    }

    public boolean isMainPage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
            return true;
        } catch (Exception xx) {
            return false;

        }
    }

    private void clickPlusCircle() {
        for (int i = 0; i < 50; i++) {

            try {
                driver.findElement(By.cssSelector(".fa-plus-circle")).click();
            } catch (ElementClickInterceptedException | NoSuchElementException ignored) {


            }
            private WebElement getNewPlayListField (){
                return driver.findElement(By.xpath("//*[@class='create']/input"));
            }


            public void createPlayList (String name){
                clickPlusCircle();
                getNewPlayListField().sendKeys(name);
                getNewPlayListField().sendKeys(Keys.RETURN);
            }
        }


    }
}