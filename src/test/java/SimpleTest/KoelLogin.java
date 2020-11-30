package SimpleTest;

import org.testng.annotations.Test;

public class KoelLogin {

//[type='email']
////[type='passwrd']
////button
//.home

    public class KoelL0gin {
        @Test
        public void loginToApp() {
            System.setProperties("webdriver.chrome.driver", "chromedriver.exe");
            WebDriver driver = new CromeDriver();
        }
    }
}
