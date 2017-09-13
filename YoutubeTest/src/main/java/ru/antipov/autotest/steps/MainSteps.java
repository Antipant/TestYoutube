package ru.antipov.autotest.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.antipov.autotest.pages.MainPage;


public class MainSteps  extends ScenarioSteps {

    MainPage mainPage;


    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        mainPage.selectMenuItem(menuItem);
    }



}
