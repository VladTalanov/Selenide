package SelenideThroughSelenium.sm1;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;

public class FirstTaskTest extends AbstractTest {
public SelenideElement loginNew(){
            return $x("//*[@type='text']");
        }
public SelenideElement passwordNew() {
        return $x("//*[@type='password']");
    }
     public SelenideElement buttonNew() {
            return $x("//*[@class='mdc-button__label']");
        }
         public SelenideElement searchList() {
                return $x("//div[@class='mdc-menu mdc-menu-surface']/..");
            }
    @Test
    @Disabled
    void authorizationTestOne() throws InterruptedException {
        loginNew.sendKeys(login);
        passwordNew.sendKeys(password);
        buttonNew.shouldBe(visible).click();
        Assertions.assertEquals("Hello, GB20230513b3712", searchList.getText());
    }
}