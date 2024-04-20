// YoutubePageObject.java
package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class YoutubePageObject {
    public SelenideElement SearchInput = $(By.cssSelector(".ytd-searchbox-spt #search"));
    public SelenideElement YoutubeSearchButton = $(By.id("search-icon-legacy"));
    
    public SelenideElement SearchInput() {
        return SearchInput;
    }
}