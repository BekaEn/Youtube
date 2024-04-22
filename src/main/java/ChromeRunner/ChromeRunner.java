package ChromeRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.codeborne.selenide.Selenide;

public class ChromeRunner {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod ()
    public void setUp(){
        System.setProperty("chrome.driver", "/Users/b.enukidze/Documents/Youtube/src/main/resources/chromedriver");
        Selenide.open("https://youtube.com/");
    }

    @AfterMethod ()
    public void tearDown(){
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}