package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static model.Constants.*;

public class OrderPage {

    public final WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public OrderPage clickButtonCreateOrderTop() {
        driver.findElement(BUTTON_CREATE_ORDER_TOP).click();
        return this;
    }
    public OrderPage clickButtonCreateOrderLower() {
        WebElement iframe = driver.findElement(BUTTON_CREATE_ORDER_LOWER);
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();
        iframe.click();
        return this;
    }
    public OrderPage clickButtonOrderNext() {
        driver.findElement(BUTTON_ORDER_NEXT).click();
        return this;
    }
    public OrderPage checkOrderInputFieldName(String name) {
        driver.findElement(ORDER_INPUT_FIELD_NAME).click();
        driver.findElement(ORDER_INPUT_FIELD_NAME).sendKeys(name);
        return this;
    }
    public OrderPage checkOrderInputFieldSurname(String surname) {
        driver.findElement(ORDER_INPUT_FIELD_SURNAME).click();
        driver.findElement(ORDER_INPUT_FIELD_SURNAME).sendKeys(surname);
        return this;
    }
    public OrderPage checkOrderInputFieldAddress(String address) {
        driver.findElement(ORDER_INPUT_FIELD_ADDRESS).click();
        driver.findElement(ORDER_INPUT_FIELD_ADDRESS).sendKeys(address);
        return this;
    }
    // метод для выбора метро
    public OrderPage selectStationMetro(int metroIndex) {
        driver.findElement(ORDER_INPUT_FIELD_STATION_METRO).click();
        driver.findElement(By.xpath(String.format("//ul/li['%s']", metroIndex))).click();
        return this;
    }
    public OrderPage checkOrderInputFieldPhone(String phone) {
        driver.findElement(ORDER_INPUT_FIELD_PHONE).click();
        driver.findElement(ORDER_INPUT_FIELD_PHONE).sendKeys(phone);
        return this;
    }
    public OrderPage orderRegistrationFirstPageOrder_createOrderTop(String name, String surname, String address, int metroIndex , String phone) {
        clickButtonCreateOrderTop();
        checkOrderInputFieldName(name);
        checkOrderInputFieldSurname(surname);
        checkOrderInputFieldAddress(address);
        selectStationMetro(metroIndex);
        checkOrderInputFieldPhone(phone);
        clickButtonOrderNext();
        return null;
    }
   public OrderPage orderRegistrationFirstPageOrder_createOrderLower(String name, String surname, String address, int metroIndex , String phone) {
        clickButtonCreateOrderLower();
        checkOrderInputFieldName(name);
        checkOrderInputFieldSurname(surname);
        checkOrderInputFieldAddress(address);
        selectStationMetro(metroIndex);
        checkOrderInputFieldPhone(phone);
        clickButtonOrderNext();
        return null;
    }
}
