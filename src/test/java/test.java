import java.time.Duration;
import ChromeRunner.ChromeRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class test extends ChromeRunner{
    @Test
    public void testSearch() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        
        // Wait for the search box to become visible
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-input")));

        // Find the actual input element within the search box
        WebElement searchInput = searchBox.findElement(By.id("search"));

        // Type a search query into the search box
        searchInput.sendKeys("Beka Enukidze");

        // Submit the form
        searchInput.submit();
    }
}