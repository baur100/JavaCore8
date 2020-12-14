package homework24;

import com.github.javafaker.Faker;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaylistTestNK extends BaseTestNK {
    int count = 0;
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void flakyTest(){
        if(count++<3){
            Assert.assertTrue(false);
        }
        Assert.assertTrue(true);
    }
    public static Faker faker = new Faker();
    public static MainPageNK mainPage;
    @BeforeMethod
    public void start(){
        LoginPageNK loginPage = new LoginPageNK(driver);
        loginPage.open();
        mainPage = loginPage.login(userName, password);
    }

    @Test
    public void createPlaylist_playlistCreated() throws InterruptedException {
        String playlistName=faker.ancient().god();
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test
    public void renamePlaylist_playlistRenamed() throws InterruptedException {
        String playlistName =faker.ancient().god();
        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName=faker.ancient().god();
        mainPage.renamePlaylist(playlistId,newPlaylistName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newPlaylistName));
    }
    @Test
    public void removePlaylist_playlistRemoved() throws InterruptedException{
        String playlistName =faker.ancient().god();
        String playlistId = mainPage.createPlaylist(playlistName);
        mainPage.removePlaylist(playlistId,playlistName);
        Thread.sleep(5000);
        Assert.assertTrue(mainPage.isPlaylistDoesntExist(playlistId));
    }
}
