package logo;

import ru.praktikum_services.qa_scooter.base_test.CommonBaseTest;
import model.MainPage;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.StringContains.containsString;

public class LogoYandexSuccessfulTransitionTest extends CommonBaseTest{

    @Test
    public void CheckSuccessfulLogoTransitionTest(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new MainPage(driver)
                .clickLogoYandex();

        String actualUrl = driver.getCurrentUrl();
        MatcherAssert.assertThat("URL не совпадает", actualUrl, anyOf(containsString("https://dzen.ru/"), containsString("https://yandex.ru/")));
    }
}
