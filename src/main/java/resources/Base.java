package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

    protected WebDriver driver;
    private Properties prop;

    public void initializeDriver() throws IOException {
        prop = new Properties();
        FileInputStream fs = new FileInputStream("src/main/java/resources/data.properties");
        prop.load(fs);

        // change 'wrikpath' to your '<firstname>path'
        String chromedriverPath = prop.getProperty("wrikpath");
        System.setProperty("webdriver.chrome.driver", chromedriverPath);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
