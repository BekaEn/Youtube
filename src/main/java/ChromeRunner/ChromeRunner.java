package ChromeRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.codeborne.selenide.Selenide;

public class ChromeRunner {
    public static ChromeDriver getChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(chromeOptions);
    }
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
        
    }

    @BeforeMethod (description = "configure browser before tests")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        Selenide.open("https://youtube.com/");
    }

    @AfterMethod (description = "Close browser and clear cookies")
public void tearDown(){
    if (driver != null) {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
      
}