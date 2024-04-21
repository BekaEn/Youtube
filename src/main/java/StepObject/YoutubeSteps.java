// This file contains the steps for the Youtube page object
package StepObject;

import PageObject.YoutubePageObject;
import io.qameta.allure.Step;

public class YoutubeSteps extends YoutubePageObject {
    @Step("Enter search query: {0}")
    public YoutubeSteps enterSearchQuery(String query) {
        SearchInput.setValue(query).pressEnter();
        return this;
    }

    @Step("Click on Search button")
    public YoutubeSteps YoutubeSearchButton() {
        youtubeSearchButton.click();
        return this;
    }

    @Step("Click on the video")
    public YoutubeSteps YoutubeClickVideo() {
        youtubeClickVideo.click();
        return this;
    }

    @Step("Click on the Subscribe button")
    public YoutubeSteps clickSubscribe() {
        ClickSubscribe.click();
        return this;
    }
}