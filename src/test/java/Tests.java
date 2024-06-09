
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Пойск вакансии в городе Гродно на позицию AQA")
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
        step("Кликаем по кнопке 'напровление' выподающего списка", () -> {
            careerPage.tagAndTextTest("span","Все направления");
        });
        step("Кликаем на позицию 'тестирование' в выподающем списке", () ->{
            careerPage.tagAndTextTest("span","Тестирование");
        });
        step("Кликаем по кнопке 'город' выподающего списка", () -> {
            careerPage.tagAndTextTest("span","Все города");
        });
        step("Кликаем на кнопку 'Гродно' в выподающем списке", () -> {
            careerPage.tagAndTextTest("span","Гродно");
        });
        step("Кликаем по результату AQA", () -> {
            careerPage.jobSelectionTest();
        });
        step("Проверяем переход на с траеицу с описанием вакансии", () -> {
            careerPage.checkingTransitionVacancyTest();
        });
    }
    @DisplayName("Заполнение резюме intexsoft")
    @Test
    public void setResume(){
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
