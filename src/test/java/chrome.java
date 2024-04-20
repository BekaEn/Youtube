import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chrome {
    @Test
    void Setup(){
        System.setProperty("chrome.driver", "Resources");
        WebDriver driver = new ChromeDriver();
    driver.get("https://www.youtube.com/");
    }
}
