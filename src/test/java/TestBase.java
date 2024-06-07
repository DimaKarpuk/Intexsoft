import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeAll
    public static void beforeAll(){
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @BeforeEach
    public void beforeEach(){
        open("https://www.intexsoft.by/");
    }
    @AfterEach
    public void afterEach(){
        closeWebDriver();
    }
}
