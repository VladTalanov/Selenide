package CreateSelenideThroughSelenium.sm1;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class createPostDummy extends AbstractTest {

    public SelenideElement loginNew() {
        return $x("//*[@type='text']");
    }

    public SelenideElement passwordNew() {
        return $x("//*[@type='password']");
    }

    public SelenideElement buttonNew() {
        return $x("//*[@class='mdc-button__label']");
    }

    public SelenideElement titleNew() {
        return $x("//*[@type='text']");
    }

    public SelenideElement descriptionNew() {
        return Selenide.$("div.field textarea.mdc-text-field__input");
    }

    public SelenideElement buttonPage() {
        return $x("//*[@type='submit']");
    }

    public SelenideElement elementsDummy() {
        return $x("//h1[@class='svelte-tv8alb']");
    }

    @Test
    @DisplayName("Create Dummy with wait")
    void createDummyInPage() {

        loginNew().sendKeys(login);
        passwordNew().sendKeys(password);
        buttonNew().shouldBe(visible).click();
        titleNew().sendKeys("New Dummy test");
        descriptionNew().sendKeys("This is description of new Dummy");
        buttonPage().shouldBe(visible).click();
        Assertions.assertEquals("New Dummy test", elementsDummy().text());

    }
}
