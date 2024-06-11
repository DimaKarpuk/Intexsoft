import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = System.getProperty("browserSize","1928x1080");
        Configuration.browser = System.getProperty("browser","chrome");
        Configuration.browserVersion = System.getProperty("version","120.0");
        Configuration.baseUrl = System.getProperty("baseUrl","https://www.intexsoft.by");
        Configuration.pageLoadStrategy = "eager"; // не дожидаемся полной загрузки страницы сайта
        Configuration.remote = System.getProperty("SelenoidURL","https://user1:1234@selenoid.autotests.cloud/wd/hub"); // добавляем URL из Jenkins
        DesiredCapabilities capabilities = new DesiredCapabilities();// добавляем видео запись
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @BeforeEach
    public void beforeEach(){
        open("https://www.intexsoft.by/");
    }
    @AfterEach
    public void afterEach(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }

}
