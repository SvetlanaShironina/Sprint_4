package logo;

import ru.praktikum_services.qa_scooter.base_test.CommonBaseTest;;
import model.MainPage;
import model.OrderPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogoScooterSuccessfulTransitionTest extends CommonBaseTest{

    @Test
    public void CheckSuccessfulLogoTransitionTest(){
        new OrderPage(driver)
                .clickButtonCreateOrderTop();
        new MainPage(driver)
                .clickLogoSamokat();
        String Url = driver.getCurrentUrl();
        assertEquals("URL не совпадает", Url, "https://qa-scooter.praktikum-services.ru/");
    }
}
