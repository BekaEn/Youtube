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
    TestUtils.pause(3000);   
        // This function will pause the test for 1 seconds
}
}