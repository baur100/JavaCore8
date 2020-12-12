package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage{
    private static Logger logger = LogManager.getLogger(MainPage.class);
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMainPage(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
            return true;
        } catch (Exception xx){
            return false;
        }
    }
    private void clickPlusCircle(){
        logger.info("trying to click plus button");
        for(int i=0;  i<50;i++){
            try {
                driver.findElement(By.cssSelector(".fa-plus-circle")).click();
                break;
            } catch (ElementClickInterceptedException | NoSuchElementException err){
                logger.error("in catch block got exception "+err.getMessage());
                logger.fatal("All is ok - just kidding");
            }
        }
    }
    private WebElement getNewPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public String createPlaylist(String name) throws InterruptedException {
        logger.info("In the create playlist method");
        clickPlusCircle();
        logger.info("Plus circle clicked");
        logger.info("Sending name "+name);
        getNewPlaylistField().sendKeys(name);
        logger.info("name sent");
        getNewPlaylistField().sendKeys(Keys.RETURN);
        logger.info("Enter pressed");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId, String name) {
        List<WebElement> list = driver.findElements(By.cssSelector("[href='#!/playlist/"+playlistId+"']"));
        return list.size()==1 && list.get(0).getText().equals(name);
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        WebElement playlist = driver.findElement(By.cssSelector("[href='#!/playlist/"+playlistId+"']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions action = new Actions(driver);
        action.doubleClick(playlist).perform();
        WebElement editField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        editField.sendKeys(Keys.CONTROL+"a");
        editField.sendKeys(newPlaylistName);
        editField.sendKeys(Keys.ENTER);
    }
}
