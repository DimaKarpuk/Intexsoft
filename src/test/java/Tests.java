
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.CareerPage;
import pages.MainPage;
import pages.ResumePage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Tests extends TestBase {
    MainPage mainPage = new MainPage();
    CareerPage careerPage = new CareerPage();
    ResumePage resumePage = new ResumePage();
    @Tag("ParameterizedTest")
    @CsvFileSource(resources = "testData/IntexsoftHeaderСareer.csv")
    @ParameterizedTest(name = "Тест кликабельности категории {0} на главной странице")
    void parameterizedCareerTest(String testData, String expected){
        step("Проверяем что находимся на главной странице Intexsoft", () ->{
            mainPage.checkMainPageTest();
        });
        step("Кликаем по выподающему списку", () -> {
            mainPage.clickChoseMenu();
        });
        step("Проверяем кликабельность элемента из выподающего списка", () -> {
            mainPage.choseCategoryTest(testData);
        });
        step("Проверяем результат проверки теста на кликабельнлсть", () -> {
            mainPage.expectValueTest(expected);
        });
    }
    @Tag("jobSearch")
    @DisplayName("Поиск вакансии в городе Гродно на позицию AQA")
    @Test
    void applicantPathTest(){
        step("Кликаем на кнопку 'стать частью команды'", () -> {
            mainPage.buttonToBecomePartOfTheTeamTest();
        });
        step("Кликаем на кнопку 'смотреть все вакансии'", () -> {
            careerPage.buttonViewVacanciesTest();
        });
        step("Проверяем преход на страницу 'вакансии'", () -> {
            careerPage.checkingPageRelevanceTest("Вакансии");
        });
        step("Кликаем по кнопке 'напровление' выпадающего списка", () -> {
            careerPage.tagAndTextTest("span","Все направления");
        });
        step("Кликаем на позицию 'тестирование' в выпадающем списке", () ->{
            careerPage.tagAndTextTest("span","Тестирование");
        });
        step("Кликаем по кнопке 'город' выпадающего списка", () -> {
            careerPage.tagAndTextTest("span","Все города");
        });
        step("Кликаем на кнопку 'Гродно' в выпадающем списке", () -> {
            careerPage.tagAndTextTest("span","Гродно");
        });
        step("Кликаем по результату AQA", () -> {
            careerPage.jobSelectionTest();
        });
        step("Проверяем переход на страницу с описанием вакансии", () -> {
            careerPage.checkingTransitionVacancyTest();
        });
    }
    @Tag("resume")
    @DisplayName("Заполнение резюме")
    @Test
    public void setResume(){
        Configuration.holdBrowserOpen = true;
        step("Открываем страницу с резюме", () -> {
            open("https://www.intexsoft.by/resume-generator/");
        });
        step("Заполняем резюме", () -> {
            resumePage.setFirstname("Дмитрий");
            resumePage.setLastname("Карпук");
            resumePage.setPosition("AQA");
            resumePage.setPhone("+375 (33) 321 71 56");
            resumePage.setEmail("karpukdima91@gmail.com");
            resumePage.setTelegram("@DIM_KArp");
            resumePage.setAddress("Беларусь/Гродно");
            resumePage.setSalary("350");
            resumePage.setSkills("Java, Selenide, JUnit, Jenkins, Allure, SQL");
            resumePage.setEnglishLevel("A2");
            resumePage.setUpload("photo.jpg");
            resumePage.setSpecialization("Мануальное тестирование, Автоматизированное тестирование");
            resumePage.setExperience("Старший инструктор-спасатель");
            resumePage.setTermWork("с 2013 по текущее время");
            resumePage.setPlaceWork("МЧС");
            resumePage.setDescription("Помощь людям в сложных ситуациях");
            resumePage.setEducationInstitution("ГрГУОР");
            resumePage.setEducationSpeciality("Педагогическая деятельность");
            resumePage.setEducationTerm("с 2008 по 2010");
            resumePage.setNameResume("Резюме Карпука Д. на позицию AQA");
        });
    }
}
