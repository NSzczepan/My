package Selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {protected WebDriver driver;
        private final String url = "https://dev-patronage-btb.azurewebsites.net";

        @BeforeSuite
        public void setChromePath() {
            System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        }

        @BeforeTest
        public void setUp() {
            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
            driver.get(url);
        }

        @AfterTest
        public void tearDown() {
            driver.quit();
        }
    }


