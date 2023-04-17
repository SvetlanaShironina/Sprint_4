package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import static model.Constants.*;

public class RentPage {
    private final WebDriver driver;
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
    public RentPage orderRegistrationSecondPageOrder(String period, String colourID, String text) {
        clickRentInputFieldDate();
        clickRentInputRentalPeriod(period);
        checkColourScooterCheckBox(colourID);
        checkRentCommentForCourier(text);
        clickButtonRentCreateOrder();
        clickButtonRentOrderConfirmation();
        return null;
    }
}
