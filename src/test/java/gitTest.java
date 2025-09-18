import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class gitTest {

    @Test
    void succesfullSearchTestWithEnter() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        open("https://duckduckgo.com/");
        $("[name=q]").setValue("текст").pressEnter();
        $(".react-results--main").shouldHave(text("Текст"));

    }

    @Test
    void succesfullSearchTestWithoutEnter() {
        Configuration.holdBrowserOpen = true;
        open("https://duckduckgo.com/");
        $("[name=q]").setValue("Mиленка мимими");
        $("[type=submit]").click();
    }
}