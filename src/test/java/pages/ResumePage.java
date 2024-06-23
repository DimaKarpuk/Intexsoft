package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ResumePage {
    ResumeProperty applicant = new ResumeProperty();
    public final SelenideElement
            firstname = $("#firstname"),
            lastname = $("#lastname"),
            position = $("#position"),
            phone = $("#phone"),
            email = $("#email"),
            telegram = $("#telegram"),
            linkedin = $("#Linkedin"),
            address = $("#address"),
            salary = $("#salary"),
            skills = $(".textarea-skills"),
            englishLevel = $("#level"),
            upload = $("#imgInp"),
            specialization = $(".textarea-specialization"),
            experience = $("#position-experience"),
            termWork = $("#term-work"),
            placeWork = $("#place-work"),
            description = $(".textarea-description"),
            educationInstitution = $("#education-institution"),
            educationSpeciality = $("#education-speciality"),
            educationTerm = $("#education-term"),
            nameResume = $(".bottom-section__name-resume");


    public void setFirstname(String firstNameKey) {
        firstname.setValue(ResumeProperty.getProperty(firstNameKey));
    }

    public void setLastname(String lastnameKey) {
        lastname.setValue(ResumeProperty.getProperty(lastnameKey));
    }

    public void setPosition(String positionKey) {
        position.setValue(ResumeProperty.getProperty(positionKey));
    }

    public void setPhone(String phoneKey) {
        phone.setValue(ResumeProperty.getProperty(phoneKey));
    }

    public void setEmail(String emailKey) {
        email.setValue(ResumeProperty.getProperty(emailKey));
    }

    public void setTelegram(String telegramKey) {
        telegram.setValue(ResumeProperty.getProperty(telegramKey));
    }

    public void setAddress(String addressKey) {
        address.setValue(ResumeProperty.getProperty(addressKey));
    }

    public void setSalary(String salaryKey) {
        salary.setValue(ResumeProperty.getProperty(salaryKey));
    }

    public void setSkills(String skillsKey) {
        skills.setValue(ResumeProperty.getProperty(skillsKey));
    }

    public void setEnglishLevel(String englishLevelKey) {
        englishLevel.setValue(ResumeProperty.getProperty(englishLevelKey));
    }

    public void setUpload(String value) {
        upload.uploadFromClasspath(value);
    }

    public void setSpecialization(String specializationKey) {
        specialization.setValue(ResumeProperty.getProperty(specializationKey));
    }

    public void setExperience(String experienceKey) {
        experience.setValue(ResumeProperty.getProperty(experienceKey));
    }

    public void setTermWork(String termWorkKey) {
        termWork.setValue(ResumeProperty.getProperty(termWorkKey));
    }

    public void setPlaceWork(String placeWorkKey) {
        placeWork.setValue(ResumeProperty.getProperty(placeWorkKey));
    }

    public void setDescription(String descriptionKey) {
        description.setValue(ResumeProperty.getProperty(descriptionKey));
    }

    public void setEducationInstitution(String educationInstitutionKey) {
        educationInstitution.setValue(ResumeProperty.getProperty(educationInstitutionKey));
    }

    public void setEducationSpeciality(String educationSpecialityKey) {
        educationSpeciality.setValue(ResumeProperty.getProperty(educationSpecialityKey));
    }

    public void setEducationTerm(String educationTermKey) {
        educationTerm.setValue(ResumeProperty.getProperty(educationTermKey));
    }

    public void setNameResume(String nameResumeKey) {
        nameResume.setValue(ResumeProperty.getProperty(nameResumeKey));
    }
    public void checkSetFirst(String firstNameKey){
        firstname.shouldHave(Condition.value(ResumeProperty.getProperty(firstNameKey)));
    }
    public void checkSetLastname(String lastNameKey){
        lastname.shouldHave(Condition.value(ResumeProperty.getProperty(lastNameKey)));
    }
    public void checkSetPosition(String positionKey){
        position.shouldHave(Condition.value(ResumeProperty.getProperty(positionKey)));
    }
    public void checkSetPhone(String phoneKey){
        phone.shouldHave(Condition.value(ResumeProperty.getProperty(phoneKey)));
    }
    public void checkSetEmail(String emailKey){
        email.shouldHave(Condition.value(ResumeProperty.getProperty(emailKey)));
    }
    public void checkSetTelegram(String telegramKey){
        telegram.shouldHave(Condition.value(ResumeProperty.getProperty(telegramKey)));
    }
    public void checkSetAddress(String addressKey){
        address.shouldHave(Condition.value(ResumeProperty.getProperty(addressKey)));
    }
    public void checkSetSalary(String salaryKey){
        salary.shouldHave(Condition.value(ResumeProperty.getProperty(salaryKey)));
    }
    public void checkSetEnglishLevel(String englishLevelKey){
        englishLevel.shouldHave(Condition.value(ResumeProperty.getProperty(englishLevelKey)));
    }
    public void checkSetExperience(String experienceKey){
        experience.shouldHave(Condition.value(ResumeProperty.getProperty(experienceKey)));
    }
    public void checkSetTermWork(String termWorkKey){
        termWork.shouldHave(Condition.value(ResumeProperty.getProperty(termWorkKey)));
    }
    public void checkSetPlaceWork(String placeWorkKey){
        placeWork.shouldHave(Condition.value(ResumeProperty.getProperty(placeWorkKey)));
    }
    public void checkSetEducationInstitution(String educationInstitutionKey){
        educationInstitution.shouldHave(Condition.value(ResumeProperty.getProperty(educationInstitutionKey)));
    }
    public void checkSetEducationSpeciality(String educationSpecialityKey){
        educationSpeciality.shouldHave(Condition.value(ResumeProperty.getProperty(educationSpecialityKey)));
    }public void checkSetEducationTerm(String educationTermKey){
        educationTerm.shouldHave(Condition.value(ResumeProperty.getProperty(educationTermKey)));
    }public void checkSetNameResume(String nameResumeKey){
        nameResume.shouldHave(Condition.value(ResumeProperty.getProperty(nameResumeKey)));
    }
}


