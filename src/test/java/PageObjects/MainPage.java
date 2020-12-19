package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BasePage{
    private static Logger logger = LogManager.getLogger(MainPage.class);
    public MainPage (WebDriver driver) {super(driver);}
    public boolean isMainPage(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
            return  true;

            }catch (Exception xx){
            return false;
        }
    }


    public void clickPlusCircle() {
        logger.info("trying to click plus button");
        for (int i = 0; i < 50; i++) {

            try {
                driver.findElement(By.cssSelector(".fa-plus-circle")).click();
                break;
            } catch (ElementClickInterceptedException | NoSuchElementException ignored) {

            }

        }
    }

    private WebElement getNewPlayListField() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='create']/input")));
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }


    public String createPlayList(String name)
        throws InterruptedException{
        logger.info("In the createplaylist method");
        clickPlusCircle();
        logger.info(("Plus circle clicked"));
        logger.info(("Sending name "+name));

            getNewPlayListField().sendKeys(name);
            logger.info("name sent");
            getNewPlayListField().sendKeys(Keys.ENTER);
            logger.info("Enter passed");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
            return driver.getCurrentUrl().split("/")[5];


        }

    public boolean isPlayListExist(String playListId, String name) {
        List<WebElement> list = driver.findElements(By.cssSelector("[href='#!/playlist/"+playListId+"']"));
        return  list.size()==1 && list.get(0).getText().equals(name);

    }

    public void renamePlayList(String playListId, String newPlayListName) {
        WebElement playList = driver.findElement(By.cssSelector("[href='#!/playlist/"+playListId+"']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", playList);

        Actions action = new Actions(driver);
        action.doubleClick(playList).perform();
        WebElement editField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        editField.sendKeys(Keys.CONTROL+"a");
        editField.sendKeys(newPlayListName);
        editField.sendKeys(Keys.ENTER);



    }
}




