package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrderPage {
    //Верхняя кнопка "заказать"
    private final By BUTTON_CREATE_ORDER_TOP =
            By.xpath("//button[@class='Button_Button__ra12g']");
    //Нижняя кнопка "заказать"
    private final By BUTTON_CREATE_ORDER_LOWER =
            By.xpath("//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    //Заказ самоката. Поле ввода "имя"
    private final By ORDER_INPUT_FIELD_NAME =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(1) > input");
    //Заказ самоката. Поле ввода "фамилия"
    private final By ORDER_INPUT_FIELD_SURNAME =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(2) > input");
    //Заказ самоката. Поле ввода "адрес"
    private final By ORDER_INPUT_FIELD_ADDRESS =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(3) > input");
    //Заказ самоката. Поле ввода "телефон"
    private final By ORDER_INPUT_FIELD_PHONE =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(5) > input");
    //Заказ самоката. Кнопка "далее"
    private final By BUTTON_ORDER_NEXT =
            By.xpath(".//Button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Заказ самоката. Поле ввода "станция метро"
    private final By ORDER_INPUT_FIELD_STATION_METRO =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(4) > div > div");
    private final WebDriver driver;

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
    public void orderRegistrationFirstPageOrder_createOrderTop(String name, String surname, String address, int metroIndex , String phone) {
        clickButtonCreateOrderTop();
        checkOrderInputFieldName(name);
        checkOrderInputFieldSurname(surname);
        checkOrderInputFieldAddress(address);
        selectStationMetro(metroIndex);
        checkOrderInputFieldPhone(phone);
        clickButtonOrderNext();
    }
   public void orderRegistrationFirstPageOrder_createOrderLower(String name, String surname, String address, int metroIndex , String phone) {
        clickButtonCreateOrderLower();
        checkOrderInputFieldName(name);
        checkOrderInputFieldSurname(surname);
        checkOrderInputFieldAddress(address);
        selectStationMetro(metroIndex);
        checkOrderInputFieldPhone(phone);
        clickButtonOrderNext();
    }
}
