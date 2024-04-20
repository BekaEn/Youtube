import StepObject.YoutubeSteps;
import DataObject.YoutubeData;
import ChromeRunner.ChromeRunner;
import org.testng.annotations.Test;

public class YoutubeTest extends ChromeRunner implements YoutubeData {
    
    @Test
public void Result() {
    YoutubeSteps youtubeSteps = new YoutubeSteps();
    try {
        Thread.sleep(1000); // Wait for 3 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    youtubeSteps.SearchInput.setValue("test").pressEnter();
            // Add your assertions here
}
}