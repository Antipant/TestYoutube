package ru.antipov.autotest.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import ru.antipov.autotest.pages.SearchPage;

import static org.testng.AssertJUnit.assertTrue;
import static ru.antipov.autotest.steps.BaseSteps.getDriver;


public class SearchSteps {

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new SearchPage(getDriver()).fillField(field, value);
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessageField(String field, String value){
        new SearchPage(getDriver()).checkFieldErrorMessage(field, value);
    }

}
