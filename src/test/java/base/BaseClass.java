package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    protected static WebDriver driver;
    public String browser;
    public String baseUrl;
    public Properties properties;


    private void loadProperties() {
        FileInputStream fis = null;

        try {
            properties = new Properties();
            fis = new FileInputStream("src/test/java/config/config.properties");
            properties.load(fis);

            browser = properties.getProperty("browser");
            baseUrl = properties.getProperty("baseUrl");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void openBrowser() {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
//        driver.quit();
        driver.close();
    }

    public void goToSite() {
        try {
            loadProperties();
            openBrowser();
            System.out.println(baseUrl);
            driver.get(baseUrl);
        } catch (Exception e) {
            System.out.println("Unable to navigate to the homepage");
            e.printStackTrace();

        }
    }

}