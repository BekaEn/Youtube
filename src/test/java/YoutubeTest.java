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
public void Result() {
    YoutubeSteps youtubeSteps = new YoutubeSteps();

    youtubeSteps.enterSearchQuery(searchQuery);
    TestUtils.pause(1000);   
    youtubeSteps.clickSearch();
    TestUtils.pause(1000);   
    youtubeSteps.clickVideo();
    TestUtils.pause(5000);   
    youtubeSteps.clickSubscribe();
    TestUtils.pause(3000);   
}
}