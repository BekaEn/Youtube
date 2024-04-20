// This file contains the steps for the Youtube page object
package StepObject;

import PageObject.YoutubePageObject;
import io.qameta.allure.Step;

public class YoutubeSteps extends YoutubePageObject {
    @Step("Click on Search button")
    public YoutubeSteps clickSearch() {
        SearchInput.click();
        return this;
    }
    @Step("Enter search query")
    public YoutubeSteps ClickSearchButton() {
        YoutubeSearchButton.click();
        return this;
    }
    @Step("Click on the video")
    public YoutubeSteps ClickVideo() {
        YoutubeClickVideo.click();
        return this;
    }
}