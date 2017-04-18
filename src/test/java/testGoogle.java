import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Vijayaragavan on 18/04/17.
 */
public class testGoogle {

    @Test
    public void test() {

//Mac os
//        System.setProperty("webdriver.gecko.driver", "/Users/Vijayaragavan/Downloads/Vodqa-Softwares/geckodriver");
// Windows
//        System.setProperty("webdriver.gecko.driver","path of geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        driver.close();
        driver.quit();
    }

}


