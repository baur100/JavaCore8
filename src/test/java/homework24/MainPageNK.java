package homework24;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPageNK extends BasePageNK{
    public MainPageNK (WebDriver driver) {
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
        for(int i=0;  i<50;i++){
            try {
                driver.findElement(By.cssSelector(".fa-plus-circle")).click();
                break;
            } catch (ElementClickInterceptedException | NoSuchElementException ignored){}
        }
    }
    private WebElement getNewPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }
    public String createPlaylist(String name) throws InterruptedException {
        clickPlusCircle();
        getNewPlaylistField().sendKeys(name);
        getNewPlaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];
    }
    public boolean isPlaylistExist(String playlistId, String name) {
        List<WebElement> list = driver.findElements(By.cssSelector("[href='#!/playlist/"+playlistId+"']"));
        return list.size()==1 && list.get(0).getText().equals(name);
    }
}
