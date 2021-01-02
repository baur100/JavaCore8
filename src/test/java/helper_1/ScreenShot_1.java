package helper_1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot_1 {
    public static void capture(WebDriver driver, String filename){
        try {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//            double xz = 5.6;
//            int xx = (int)xz;
            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("./screenshots/"+filename+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}