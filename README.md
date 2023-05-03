# ui_tests_qa-scooter
### Тестируется страница Яндекс Самоката

https://qa-scooter.praktikum-services.ru/

### Используемые технологии
 - Java 11
 - JUnit 4.13.2
 - maven 4.0.0 
 - selenium-java 4.8.1
 - webdrivermanager 5.3.2

### Список тестов 
#### logo:
1. LogoScooterSuccessfulTransitionTest - кликабельность логотипа «Самоката».
2. LogoYandexSuccessfulTransitionTest - кликабельность логотипа «Яндекса».
#### order_registration:
1. SuccessfulOrderRegistrationTest - заказ самоката. Весь флоу позитивного сценария.
#### page_with_questions:
1. CheckMainPageAnswersToQuestionsTextTest - выпадающий список в разделе «Вопросы о важном». Соответствие текста.
#### Базовые тесты Before & After находятся в пакете:
- ru.praktikum_services.qa_scooter.base_test

#### В классе "CommonBaseTest" Можно выбрать один из двух браузеров:
- Edge
```
    WebDriverManager.edgedriver().setup();
    EdgeOptions options = new EdgeOptions();
    options.addArguments("--remote-allow-origins=*");
    driver = new EdgeDriver(options);
    driver.get(PAGE_URL);
    MainPage objMainPage = new MainPage(driver);
    objMainPage.clickPopUpCookies();
```
- Chrome
```
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
    driver.get(PAGE_URL);
    MainPage objMainPage = new MainPage(driver);
    objMainPage.clickPopUpCookies();
```
