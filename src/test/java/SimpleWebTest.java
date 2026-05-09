import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class SimpleWebTest {

    @Test
    void firstWebTest() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        browser = "chrome";
        headless = false;
        timeout = 10000;


        open("https://the-internet.herokuapp.com/");


        $("h2").shouldHave(text("Available Examples"));


        $$("a").find(text("Form Authentication")).should(exist);
    }
}