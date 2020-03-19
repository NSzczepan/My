;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*import org.testng.annotations.Test*/;

public class test {
    @Test
    public void demoTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\test2\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://google.com");
    }
}
