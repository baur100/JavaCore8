package homework24;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPageNK extends BasePageNK {
    public MainPageNK(WebDriver driver) {
        super(driver);
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
                break;
            } catch (ElementClickInterceptedException | NoSuchElementException ignored) {
            }
        }
    }

    private WebElement getNewPlaylistField() {

        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }


    public String createPlaylist(String name) throws InterruptedException {
        clickPlusCircle();
        getNewPlaylistField().sendKeys(name);
        getNewPlaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        System.out.println(driver.getCurrentUrl().split("/")[5]);
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId, String name) {
        List<WebElement> list = driver.findElements(By.cssSelector("[href='#!/playlist/" + playlistId + "']"));
        return list.size() == 1 && list.get(0).getText().equals(name);
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[href='#!/playlist/"+playlistId+"']")));
        WebElement PlaylistName = driver.findElement(By.cssSelector("[href='#!/playlist/" + playlistId + "']")); //href="#!/playlist/54"
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", PlaylistName);

        Actions action = new Actions(driver);
        action.doubleClick(PlaylistName).perform();

        WebElement editPlaylistField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        editPlaylistField.sendKeys(Keys.COMMAND + "a");
        editPlaylistField.sendKeys(newPlaylistName);
        editPlaylistField.sendKeys(Keys.ENTER);
    }
    public void removePlaylist(String playlistId, String newPlaylistName){
        WebElement PlaylistName = driver.findElement(By.cssSelector("[href='#!/playlist/" + playlistId + "']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", PlaylistName);

        Actions action = new Actions(driver);
        action.click(PlaylistName).perform();

        WebElement removeButton = driver.findElement(By.cssSelector("[class=\"del btn btn-red btn-delete-playlist\"]"));
        removeButton.click();
    }
    public boolean isPlaylistDoesntExist(String playlistId) {
        List<WebElement> list = driver.findElements(By.cssSelector("[href='#!/playlist/" + playlistId + "']"));
        System.out.println(list.size());
        return list.size()==0;
    }
}
