import Selenium.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginFalseTest {
    private WebDriver driver;

    LoginPage lp;

    @BeforeTest

    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://dev-patronage-btb.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }



    @Test(priority = 0)

    public  void testLoginPage(){
        lp = new LoginPage(driver);

        lp.signIn("adm","admin");

       // lp.clickRememberMe();
        lp.clickSignIn();


    }



}