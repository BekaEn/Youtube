// YoutubePageObject.java
package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import DataObject.YoutubeData;

import static com.codeborne.selenide.Selenide.$;

public class YoutubePageObject {
    public SelenideElement SearchInput = $(By.cssSelector(".ytd-searchbox-spt #search"));
    public SelenideElement youtubeSearchButton = $(By.id("search-icon-legacy"));
    public SelenideElement youtubeClickVideo = $(By.xpath("//a[@title='" + YoutubeData.TitleVideo + "']"));
    public SelenideElement ClickSubscribe = $(By.xpath("//*[@id='subscribe-button-shape']"));
    
}