import java.time.Duration;
import ChromeRunner.ChromeRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class SearchOnYoutube extends ChromeRunner{
    @Test
    public void testSearch() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        
        // Wait for the search box to become visible
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-input")));

        // Find the actual input element within the search box
        WebElement searchInput = searchBox.findElement(By.id("search"));

        // Type a search query into the search box
        searchInput.sendKeys("LISTEN EVERYDAY! I AM affirmations for coding|ComputerProgramming Affirmations|Coding Affirmations");

        // Submit the form
        searchInput.submit();
        // Wait for the search results to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("video-title")));

        // Find the link with the specific title and click on it
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("ComputerProgramming Affirmations|")));
        link.click();

        // Wait for the video to load
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}