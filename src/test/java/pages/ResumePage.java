package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ResumePage {
    public final SelenideElement
            firstname = $("#firstname"),
            lastname = $("#lastname"),
            position = $("#position"),
            phone = $("#phone"),
            email = $("#email"),
            telegram = $("#telegram"),
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

    public void setFirstname(String value) {
        firstname.setValue(value);
    }

    public void setLastname(String value) {
        lastname.setValue(value);
    }

    public void setPosition(String value) {
        position.setValue(value);
    }

    public void setPhone(String value) {
        phone.setValue(value);
    }

    public void setEmail(String value) {
        email.setValue(value);
    }

    public void setTelegram(String value) {
        telegram.setValue(value);
    }

    public void setAddress(String value) {
        address.setValue(value);
    }

    public void setSalary(String value) {
        salary.setValue(value);
    }

    public void setSkills(String value) {
        skills.setValue(value);
    }

    public void setEnglishLevel(String value) {
        englishLevel.setValue(value);
    }

    public void setUpload(String value) {
        upload.uploadFromClasspath(value);
    }

    public void setSpecialization(String value) {
        specialization.setValue(value);
    }

    public void setExperience(String value) {
        experience.setValue(value);
    }

    public void setTermWork(String value) {
        termWork.setValue(value);
    }

    public void setPlaceWork(String value) {
        placeWork.setValue(value);
    }

    public void setDescription(String value) {
        description.setValue(value);
    }

    public void setEducationInstitution(String value) {
        educationInstitution.setValue(value);
    }

    public void setEducationSpeciality(String value) {
        educationSpeciality.setValue(value);
    }

    public void setEducationTerm(String value) {
        educationTerm.setValue(value);
    }

    public void setNameResume(String value) {
        nameResume.setValue(value);
    }
}
