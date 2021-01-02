package pageObjectTests;

import com.github.javafaker.Faker;
import helper_1.TestDataGenerator_1;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests1 extends BaseTest{
    @Test
    public void createPlaylist_playlistCreated_a() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator_1.randomString(8); //faker.ancient().god();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test
    public void renamePlaylist_playlistRenamed_a() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator_1.randomString(8); //faker.ancient().god();
        String newPlaylistName = TestDataGenerator_1.randomString(9);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newPlaylistName));
    }
    @Test
    public void createPlaylist_playlistCreated1_a() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator_1.randomString(8); //faker.ancient().god();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test
    public void renamePlaylist_playlistRenamed1_a() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator_1.randomString(8); //faker.ancient().god();
        String newPlaylistName = TestDataGenerator_1.randomString(9);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newPlaylistName));
    }
    @Test
    public void createPlaylist_playlistCreated2_a() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator_1.randomString(8); //faker.ancient().god();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test
    public void renamePlaylist_playlistRenamed2_a() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator_1.randomString(8); //faker.ancient().god();
        String newPlaylistName = TestDataGenerator_1.randomString(9);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newPlaylistName));
    }
}
