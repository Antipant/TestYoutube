package ru.antipov.autotest.steps;



import net.thucydides.core.annotations.Step;
import ru.antipov.autotest.pages.RegistrationPage;

public class RegistrationSteps {
    RegistrationPage registrationPage;





    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        registrationPage.fillField(field, value);

    }
}
