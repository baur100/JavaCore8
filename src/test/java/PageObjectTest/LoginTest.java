package PageObjectTest;

        import PageObject.LoginPage;
        import PageObjects.MainPage;
        import listeners.RetryAnalyzer;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void flakyTest(){
        int count = 0;
        if (count++<3){
            Assert.assertTrue(false);

        }
        Assert.assertTrue(true);
    }


    @Test
    public void loginToAppUsingCorrectCredentials_SuccessfulLoginToApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        Assert.assertTrue(mainPage.isMainPage());

    }

    @Test
    public void wronglogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(userName, password);
        Assert.assertTrue(loginPage.isError());

    }

    @Test
    public void loginToApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(userName, password);
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test(enabled=false)
    public void wronglogin1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(userName, "WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
