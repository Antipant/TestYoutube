package ru.antipov.autotest.pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RegistrationPage extends BasePage {

    @FindBy(name = "identifier")
    WebElement login;



    @FindBy(name = "password")
    WebElement password;



    public void fillField(String fieldName, String value) {
        switch (fieldName){
            case  "identifier":
                fillField(login, value);
                break;
            case  "password":
                fillField(password, value);
                break;

            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }
}

