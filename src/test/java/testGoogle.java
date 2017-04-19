import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Vijayaragavan on 18/04/17.
 */
public class testGoogle {

    @Test
    public void test() {

         //Firefox 47 and above
//        System.setProperty("webdriver.gecko.driver", "/Users/Vijayaragavan/Downloads/Vodqa-Softwares/geckodriver");
        System.setProperty("webdriver.firefox.marionette", "/Users/Vijayaragavan/Downloads/Vodqa-Softwares/geckodriver");
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);

        driver.get("http://www.google.com");

        driver.close();
        driver.quit();
    }

}


