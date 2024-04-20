package StepObject;

import PageObject.YoutubePageObject;
import io.qameta.allure.Step;

public class YoutubeSteps extends YoutubePageObject {
    @Step("Click on Search button")
    public YoutubeSteps ClickSearchField() {
        getSearchInput().click();
        return this;
    }
    @Step("Search for a video with query: {query}")
    public YoutubeSteps searchForVideo(String query) {
        getSearchInput().setValue(query).pressEnter();
        return this;
    }
    
}