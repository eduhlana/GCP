package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
                options.addArguments("-incognito");
                driver = new ChromeDriver(options); 
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
    

