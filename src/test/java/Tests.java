
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

    @Tag("parameterizedTest")
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
    void applicantPathTest() {
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
            careerPage.tagAndTextTest("span", "Все направления");
        });
        step("Кликаем на позицию 'тестирование' в выпадающем списке", () -> {
            careerPage.tagAndTextTest("span", "Тестирование");
        });
        step("Кликаем по кнопке 'город' выпадающего списка", () -> {
            careerPage.tagAndTextTest("span", "Все города");
        });
        step("Кликаем на кнопку 'Гродно' в выпадающем списке", () -> {
            careerPage.tagAndTextTest("span", "Гродно");
        });
        step("Закрываем выпадающий список выбора города", () -> {
            careerPage.closeCheckBox();
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
    public void setResumeTest() {
        step("Открываем страницу с резюме", () -> {
            open("https://www.intexsoft.by/resume-generator/");
        });
        step("Заполняем резюме", () -> {
            resumePage.setFirstname("name");
            resumePage.setLastname("lastname");
            resumePage.setPosition("position");
            resumePage.setPhone("phone");
            resumePage.setEmail("email");
            resumePage.setTelegram("telegram");
            resumePage.setAddress("address");
            resumePage.setSalary("salary");
            resumePage.setSkills("skills");
            resumePage.setEnglishLevel("englishLevel");
            resumePage.setUpload("photo.jpg");
            resumePage.setSpecialization("specialization");
            resumePage.setExperience("experience");
            resumePage.setTermWork("termWork");
            resumePage.setPlaceWork("placeWork");
            resumePage.setDescription("description");
            resumePage.setEducationInstitution("educationInstitution");
            resumePage.setEducationSpeciality("educationSpeciality");
            resumePage.setEducationTerm("educationTerm");
            resumePage.setNameResume("nameResume");
        });
    }
}
