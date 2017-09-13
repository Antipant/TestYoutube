package ru.antipov.autotest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.name;


public class MainPage extends BasePage {

    @FindBy(name="Войти")
    WebElement menuItems;


    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//li[contains(@class,'current')]/*[contains(text(),'"+itemName+"')]")).click();
    }


}
