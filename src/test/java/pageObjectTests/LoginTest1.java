package pageObjectTests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest1 extends BaseTest{
    int count = 0;
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void flakyTest(){
        if(count++<3){
            Assert.assertTrue(false);
        }
        Assert.assertTrue(true);
    }
    @Test(enabled = false)
    public void login_loginToAppUsingCorrectCredentials_SuccessfulLoginToApp_a(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test(enabled = false)
    public void wrongLogin_a(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login(userName,"WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp1_a(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void wrongLogin1_a(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login(userName,"WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp2_a(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void wrongLogin2_a(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login(userName,"WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
}
