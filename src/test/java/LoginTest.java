import Selenium.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;

    LoginPage lp;

    @BeforeTest

    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://dev-patronage-btb.azurewebsites.net/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }



    @Test (priority = 0)

    public  void testLoginPage(){
        lp = new LoginPage(driver);

        lp.signIn("admin","admin");

       // lp.clickRememberMe();
        lp.clickSignIn();


    }



}
