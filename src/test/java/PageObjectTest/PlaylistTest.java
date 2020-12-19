package PageObjectTest;

import Helper.TestDataGenerator;
import PageObject.LoginPage;
import PageObjects.MainPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTest extends BaseTest {

    @Test
    public void createPlaylist_playListCreated() throws InterruptedException {
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        String playListId = mainPage.createPlayList(playListName);
        Assert.assertTrue(mainPage.isPlayListExist(playListId, playListName));

    }

    @Test
    public void renamePlaylist_playListRenamed() throws InterruptedException {
        Faker faker = new Faker();
        String playListName = TestDataGenerator.randomString(8);
        String newPlayListName = TestDataGenerator.randomString(9);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        String playListId = mainPage.createPlayList(playListName);
        mainPage.renamePlayList(playListId, newPlayListName);
        Assert.assertTrue(mainPage.isPlayListExist(playListId, newPlayListName));


    }
}
