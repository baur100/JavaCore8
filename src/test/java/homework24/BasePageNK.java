package homework24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageNK {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePageNK(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver,10,200);
    }
}
