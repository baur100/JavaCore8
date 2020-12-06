package homework24;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTestsNK extends BaseTest{
    @Test
    public void createPlaylist_playlistCreated() throws InterruptedException {
        Faker faker = new Faker();
        faker.ancient().god();
        LoginPageNK loginPage = new LoginPageNK(driver);
        loginPage.open();
        MainPageNK mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
//        String playlistId = mainPage.createPlaylist(playlistName);
//        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
//    @Test
//    public void renamePlaylist_playlistRenamed() throws InterruptedException {
//        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.randomString(8); //faker.ancient().god();
//        String newPlaylistName = TestDataGenerator.randomString(9);
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
//        String playlistId = mainPage.createPlaylist(playlistName);
//        // TODO Add new function to rename playlist
//        mainPage.renamePlaylist(playlistId,newPlaylistName);
//
//        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newPlaylistName));
//    }
}
