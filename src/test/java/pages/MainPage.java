package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public final SelenideElement
            checkMainPage = $("[alt='Intexsoft']"),
            choseMenu = $("#menu-item-1739"),
            choseCategory = $(".sub-menu"),
            expectValue = $(".hero__title"),
            buttonToBecomePartOfTheTeam = $("#menu-item-4043");

    public void openPage() {
        open(baseUrl);
    }

    public void checkMainPageTest() {
        checkMainPage.shouldBe(visible);
    }

    public void clickChoseMenu() {
        choseMenu.click();
    }

    public void choseCategoryTest(String data) {
        choseCategory.$(byText(data)).click();
    }

    public void expectValueTest(String expected) {
        expectValue.shouldHave(text(expected));
    }
    public void buttonToBecomePartOfTheTeamTest(){
        buttonToBecomePartOfTheTeam.click();
    }
}