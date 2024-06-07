package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    public final SelenideElement
    buttonViewVacancies = $("[href='https://www.intexsoft.by/vacancies/?part=1']"),
    checkingPageRelevance = $("h1"),
    jobSelection = $("[href='https://www.intexsoft.by/jobs/aqa/']"),
    checkingTransitionVacancy = $(".hero-single-career__header");
    public void buttonViewVacanciesTest(){
        buttonViewVacancies.click();
    }
    public void checkingPageRelevanceTest(String expected){
        checkingPageRelevance.shouldHave(text(expected));
    }
    public void tagAndTextTest(String tag, String text){
        $(withTagAndText(tag, text)).click();
    }
    public void jobSelectionTest(){
        jobSelection.click();
    }
    public void checkingTransitionVacancyTest(){
        checkingTransitionVacancy.shouldHave(text("AQA"));
    }
}
