package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class RentPage {
    private final WebDriver driver;
    //Поле выбора даты доставки
    private final By RENT_DELIVERY_DATE =
            By.xpath("//div[@class='react-datepicker__input-container']/input[@type='text']");
    //Поле выбора периода аренды
    private final By RENT_RENTAL_PERIOD =
            By.xpath("//div[@class='Dropdown-control']");
    //Чек бокс выбора цвета
    private final By RENT_CHECKBOX_COLOUR_SCOOTER =
            By.xpath("//div[@class='Order_Checkboxes__3lWSI']");
    //Поле для комментария
    private final By RENT_COMMENT_FOR_COURIER =
            By.xpath("//div[@class='Input_InputContainer__3NykH']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Создать заказ
    private final By BUTTON_RENT_CREATE_ORDER =
            By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Подтвердить заказ, нажав на кнопку "да"
    private final By BUTTON_RENT_ORDER_CONFIRMATION =
            By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
    public RentPage(WebDriver driver) {
        this.driver = driver;
    }

    public RentPage clickRentInputFieldDate() {
        driver.findElement(RENT_DELIVERY_DATE).click();
        driver.findElement(RENT_DELIVERY_DATE).sendKeys(Keys.ENTER);
        return this;
    }
    public RentPage clickRentInputRentalPeriod(String period) {
        driver.findElement(RENT_RENTAL_PERIOD).click();
        driver.findElement(By.xpath(String.format("//div[@class='Dropdown-menu']/div[text()='%s']", period))).click();
        return this;
    }
    public RentPage checkColourScooterCheckBox(String colourID) {
        driver.findElement(RENT_CHECKBOX_COLOUR_SCOOTER).click();
        driver.findElement(By.xpath(String.format("//div[@class='Order_Checkboxes__3lWSI']/label/input[@id='%s']", colourID))).click();
        return this;
    }
    public RentPage checkRentCommentForCourier(String text) {
        driver.findElement(RENT_COMMENT_FOR_COURIER).click();
        driver.findElement(RENT_COMMENT_FOR_COURIER).sendKeys(text);
        return this;
    }
    public RentPage clickButtonRentCreateOrder() {
        driver.findElement(BUTTON_RENT_CREATE_ORDER).click();
        return this;
    }
    public RentPage clickButtonRentOrderConfirmation() {
        driver.findElement(BUTTON_RENT_ORDER_CONFIRMATION).click();
        return this;
    }
    public void orderRegistrationSecondPageOrder(String period, String colourID, String text) {
        clickRentInputFieldDate();
        clickRentInputRentalPeriod(period);
        checkColourScooterCheckBox(colourID);
        checkRentCommentForCourier(text);
        clickButtonRentCreateOrder();
        clickButtonRentOrderConfirmation();
    }
}
