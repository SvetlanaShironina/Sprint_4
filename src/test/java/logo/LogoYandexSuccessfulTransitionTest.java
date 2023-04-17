package logo;

import baseTest.CommonBaseTest;
import model.MainPage;
import model.OrderPage;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LogoYandexSuccessfulTransitionTest extends CommonBaseTest{

    @Test
    public void CheckSuccessfulLogoTransitionTest(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new MainPage(driver)
                .clickLogoYandex();
        driver.findElement(By.xpath("//div[@class='Header_Logo__23yGT']//a[@class='Header_LogoYandex__3TSOI']")).click();
        String Url = driver.getCurrentUrl();
        assertEquals("URL не совпадает", Url, "https://dzen.ru/?yredirect=true");
        // возможно тут будет ответ или посмотреть тесты у макса
        //https://translated.turbopages.org/proxy_u/en-ru.ru.2bad5959-643aee86-d769f1f7-74722d776562/https/stackoverflow.com/questions/36174711/how-to-verify-that-clicked-on-url-is-being-opened-before-redirect-in-selenium-web-driver
    }
}
