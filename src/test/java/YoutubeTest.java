import StepObject.YoutubeSteps;
import DataObject.YoutubeData;
import ChromeRunner.ChromeRunner;
import org.testng.annotations.Test;
import SmallerVersions.TestUtils;

public class YoutubeTest extends ChromeRunner implements YoutubeData {
    
    @Test
public void Result() {
    YoutubeSteps youtubeSteps = new YoutubeSteps();

    youtubeSteps.SearchInput.setValue(searchQuery).pressEnter();
        // This function will enter the search query
    youtubeSteps.YoutubeSearchButton.click();
        // This function will click the search button
    TestUtils.pause(1000);   
        // This function will pause the test for 1 seconds
    youtubeSteps.YoutubeClickVideo.click();
        // This function will click the video
    TestUtils.pause(5000);   
        // This function will pause the test for 5 seconds
    youtubeSteps.ClickSubscribe.click();
        // This function will click the subscribe button
    TestUtils.pause(3000);   
        // This function will pause the test for 3 seconds
}
}