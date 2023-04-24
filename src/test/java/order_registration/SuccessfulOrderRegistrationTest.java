package order_registration;

import ru.praktikum_services.qa_scooter.base_test.CommonBaseTest;
import model.OrderPage;
import model.RentPage;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.containsString;

@RunWith(Parameterized.class)
public class SuccessfulOrderRegistrationTest extends CommonBaseTest {

    private final String name;
    private final String surname;
    private final String address;
    private final int metroIndex;
    private final String phone;
    private final String period;
    private final String colourID;
    private final String text;
    //Поп-ап об успешном создании заказа
    public static final By ORDER_COMPLETED_IMAGE =
            By.xpath("//div[@class='Order_Modal__YZ-d3']/div[text()='Заказ оформлен']");

    public SuccessfulOrderRegistrationTest(String name, String surname, String address, int metroIndex, String phone,
                                           String period, String colourID, String text) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroIndex = metroIndex;
        this.phone = phone;
        this.period = period;
        this.colourID = colourID;
        this.text = text;
    }

    @Parameterized.Parameters
    public static Object[][] userData() {

        return new Object[][]{{"Максим", "Иванов", "Проспект большевиков", 7, "79511059516",
                "трое суток", "grey", "За час позвонить"},
                {"Максим Федор", "Иванов", "Проспект большевиков д 4", 12, "79511059516",
                        "двое суток", "black", ""}};
    }

    @Test
    public void successfulOrderRegistration_topOrderButton() {
        new OrderPage(driver)
                .orderRegistrationFirstPageOrder_createOrderTop(name, surname, address, metroIndex, phone);
        new RentPage(driver)
                .orderRegistrationSecondPageOrder(period, colourID, text);
        String text = driver.findElement(ORDER_COMPLETED_IMAGE).getText();
        MatcherAssert.assertThat(text, containsString("Заказ оформлен"));
    }

    @Test
    public void successfulOrderRegistration_lowerOrderButton() {
        new OrderPage(driver)
                .orderRegistrationFirstPageOrder_createOrderLower(name, surname, address, metroIndex, phone);
        new RentPage(driver)
                .orderRegistrationSecondPageOrder(period, colourID, text);
        String text = driver.findElement(ORDER_COMPLETED_IMAGE).getText();
        MatcherAssert.assertThat("Заказ не оформлен",text, containsString("Заказ оформлен"));
    }
}
