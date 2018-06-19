package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author eduardo.lana
 */
public class DriverFactory {
     private static WebDriver driver;

        public static WebDriver GetDriver()
        {

            if (driver == null)
            {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
               
                String pathselenium = "C:\\Users\\eduardo.lana\\.nuget\\packages\\selenium.webdriver.chromedriver\\2.37.0\\driver\\win32\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", pathselenium);
                driver = new ChromeDriver(options); 
                
//                DesiredCapabilities caps = new DesiredCapabilities();
//                caps.setJavascriptEnabled(true);                
//                caps.setCapability("takesScreenshot", true);  
//                caps.setCapability(
//                        PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"E:\\phanthom\\bin\\phantomjs.exe"
//                    );
//                WebDriver driver = new  PhantomJSDriver(caps);
            }
            return driver;
        }

        public static void KillDriver()
        {
            if (driver != null)
            {
                driver.quit();
                driver = null;
            }
        }
}
    

