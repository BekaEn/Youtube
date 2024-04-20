import StepObject.YoutubeSteps;
import DataObject.YoutubeData;
import ChromeRunner.ChromeRunner;
import org.testng.annotations.Test;

public class YoutubeTest extends ChromeRunner implements YoutubeData {
    private YoutubeSteps youtubeSteps;

    @Test
    public void testResult() {
        youtubeSteps.ClickSearch(Click);
        // Add your assertions here
    }
    
    public void testSearch() {
        Thread.sleep(3000); // Wait for 3 seconds
        youtubeSteps.searchForVideo(searchQuery);
        // Add your assertions here
    }
    
}