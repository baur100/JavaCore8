package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest extends BaseTest{
    @Test
    public void login_loginToAppUsingCorrectCredentials_SuccessfulLoginToApp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void wrongLogin(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login("koeluser06@testpro.io","WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void wrongLogin1(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login("koeluser06@testpro.io","WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void wrongLogin2(){
        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        // Act
        loginPage.login("koeluser06@testpro.io","WrongPassword");
        // Assert
        Assert.assertTrue(loginPage.isError());
    }
}
