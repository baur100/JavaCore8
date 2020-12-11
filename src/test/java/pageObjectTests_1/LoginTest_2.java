package pageObjectTests_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectTests.BaseTest;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest_2 extends BaseTest_1 {
    @Test
    public void loginToApp(){
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
}
