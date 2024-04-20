// YoutubePageObject.java
package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Condition.visible;

public class YoutubePageObject {
    public SelenideElement searchInput;

    public YoutubePageObject() {
        sleep(3000); // Wait for 3 seconds
        SelenideElement searchBox = $("#search-input").shouldBe(visible);
        searchInput = searchBox.$("#search");
    }

    public SelenideElement getSearchInput() {
        return searchInput;
    }
}