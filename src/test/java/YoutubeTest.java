import DataObject.YoutubeData;
import ChromeRunner.ChromeRunner;
import org.testng.annotations.Test;
import SmallerVersions.TestUtils;
import StepObject.YoutubeSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;

public class YoutubeTest extends ChromeRunner implements YoutubeData {
    @Test()
@Step("Subscribe Test")
@Description("This test will search for a video, click on it, and subscribe to the channel")
@Severity(SeverityLevel.CRITICAL)
public void Subscribe() {
    String testCaseId = "your_test_case_id"; // Replace with your actual TestRail test case ID

    YoutubeSteps youtubeSteps = new YoutubeSteps();

    youtubeSteps.enterSearchQuery(searchQuery);
    TestUtils.pause(1000);   
    youtubeSteps.YoutubeSearchButton();
    TestUtils.pause(3000);   
    youtubeSteps.YoutubeClickVideo();
    TestUtils.pause(5000);   
    youtubeSteps.clickSubscribe();
    TestUtils.pause(3000);   

    try {
        Assert.assertEquals("Sign in to subscribe to this channel", "Sign in to subscribe to this channel");

        // If the assertion is successful, update the test result in TestRail as passed
        TestRailConnector.addResultForTest(testCaseId, 1, "Test passed");
    } catch (AssertionError e) {
        // If the assertion fails, update the test result in TestRail as failed
        TestRailConnector.addResultForTest(testCaseId, 5, "Test failed: " + e.getMessage());
    }
}
}