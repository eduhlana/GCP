package core;

import java.io.File;
import java.io.IOException;
import java.util.Date;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import sun.net.www.content.image.jpeg;





/**
 *
 * @author eduardo.lana
 */
public class ScreenShots extends BaseTest{
    public static void takeScreenshot(String fileName){
        File scrFile = ((TakesScreenshot)DriverFactory.GetDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFileToDirectory(scrFile, new File("E:\\GCP\\SeleniumScreenShots\\"+fileName),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
