package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest1 extends BaseTest{
    @Test(enabled = false)
    public void login_loginToAppUsingCorrectCredentials_SuccessfulLoginToApp_a(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test(enabled = false)
    public void wrongLogin_a(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login("koeluser06@testpro.io","WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp1_a(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void wrongLogin1_a(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login("koeluser06@testpro.io","WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp2_a(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void wrongLogin2_a(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login("koeluser06@testpro.io","WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
}
