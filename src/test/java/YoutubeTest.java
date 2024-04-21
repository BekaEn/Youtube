import StepObject.YoutubeSteps;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import DataObject.YoutubeData;
import ChromeRunner.ChromeRunner;
import org.testng.annotations.Test;
import SmallerVersions.TestUtils;
import io.qameta.allure.Description; 

    public class YoutubeTest extends ChromeRunner implements YoutubeData {
        @Test
        @Description("This test will search for a video, click on it, and subscribe to the channel")
        @Severity(SeverityLevel.CRITICAL)
        public void Subscribe() {
        YoutubeSteps youtubeSteps = new YoutubeSteps();

        youtubeSteps.enterSearchQuery(searchQuery);
        // Enter the search query
        TestUtils.pause(1000);   
        youtubeSteps.YoutubeSearchButton();
        // Search for the video
        TestUtils.pause(1000);   
        youtubeSteps.YoutubeClickVideo();
        // Click on the video
        TestUtils.pause(5000);   
        youtubeSteps.clickSubscribe();
        // Subscribe to the channel
        TestUtils.pause(3000);   
}
    
}