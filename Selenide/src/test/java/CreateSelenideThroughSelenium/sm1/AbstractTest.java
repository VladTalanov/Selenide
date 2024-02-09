package CreateSelenideThroughSelenium.sm1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AbstractTest {
    String login = "GB20230513b3712";
    String password = "b6f2300019";


    @BeforeEach
    void init() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Selenide.open("https://test-stand.gb.ru/login");
        Configuration.pageLoadTimeout = 5000;

    }
    @AfterEach
    void close() {
        Selenide.closeWebDriver();
    }
}


