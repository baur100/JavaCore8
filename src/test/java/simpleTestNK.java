import org.testng.annotations.Test;

public class simpleTestNK {

//    [type='email']
//    [type='password']
//    button
//    .home

    @Test
    public void LoginToApp(){
//        Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);

//        Act
        WebElement email=driver.findElement(By.cssSelector("[type='email']"));


//        Assert
        try{
            WebElement homeIcon=driver.findElement(By.cssSelector(".home"));
            Assert.assertTrue(true);
        } catch (NoSuchElementExeption xx){
            Assert.assertTrue(false,"Home element not found");
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
