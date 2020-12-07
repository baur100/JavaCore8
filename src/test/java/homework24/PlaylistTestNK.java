package homework24;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTestNK extends BaseTestNK {
    @Test
    public void createPlaylist_playlistCreated() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName=faker.ancient().god();
        LoginPageNK loginPage = new LoginPageNK(driver);
        loginPage.open();
        MainPageNK mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test
    public void renamePlaylist_playlistRenamed() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName =faker.ancient().god();
        LoginPageNK loginPage = new LoginPageNK(driver);
        loginPage.open();
        MainPageNK mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(playlistName);
//
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newPlaylistName));
    }
}
