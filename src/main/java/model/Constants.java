package model;

import org.openqa.selenium.By;

public class Constants {
    public static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    //логотип самокат
    protected static final By BUTTON_LOGO_SCOOTER =
            By.xpath(".//img[@alt='Scooter']");
    //логотип яндекс
    protected static final By BUTTON_LOGO_YANDEX =
            By.xpath("//div[@class='Header_Logo__23yGT']//a[@class='Header_LogoYandex__3TSOI']");
    //Верхняя кнопка "заказать"
    protected static final By BUTTON_CREATE_ORDER_TOP =
            By.xpath("//button[@class='Button_Button__ra12g']");
    //Нижняя кнопка "заказать"
    protected static final By BUTTON_CREATE_ORDER_LOWER =
            By.xpath("//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    //Заказ самоката. Кнопка "далее"
    protected static final By BUTTON_ORDER_NEXT =
            By.xpath(".//Button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Заказ самоката. Поле ввода "имя"
    protected static final By ORDER_INPUT_FIELD_NAME =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(1) > input");

    //Заказ самоката. Поле ввода "фамилия"
    protected static final By ORDER_INPUT_FIELD_SURNAME =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(2) > input");
    //Заказ самоката. Поле ввода "адрес"
    protected static final By ORDER_INPUT_FIELD_ADDRESS =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(3) > input");
    //Заказ самоката. Поле ввода "станция метро"
    protected static final By ORDER_INPUT_FIELD_STATION_METRO =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(4) > div > div");
    //Заказ самоката. Поле ввода "телефон"
    protected static final By ORDER_INPUT_FIELD_PHONE =
            By.cssSelector("div.Order_Form__17u6u > div:nth-child(5) > input");
    //Закрыть всплывающее окно куки
    protected static final By CLOSE_POPUP_WINDOW =
            By.xpath(".//Button[@id='rcc-confirm-button']");
    //Поле выбора даты доставки
    protected static final By RENT_DELIVERY_DATE =
            By.xpath("//div[@class='react-datepicker__input-container']/input[@type='text']");
    //Поле выбора периода аренды
    protected static final By RENT_RENTAL_PERIOD =
            By.xpath("//div[@class='Dropdown-control']");
    //Чек бокс выбора цвета
    protected static final By RENT_CHECKBOX_COLOUR_SCOOTER =
            By.xpath("//div[@class='Order_Checkboxes__3lWSI']");
    //Поле для комментария
    protected static final By RENT_COMMENT_FOR_COURIER =
            By.xpath("//div[@class='Input_InputContainer__3NykH']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Создать заказ
    protected static final By BUTTON_RENT_CREATE_ORDER =
            By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Возврат к странице ввода данных пользователя. Кнопка "назад"
    protected static final By BUTTON_BACK_RENT_PAGE =
            By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']");
    //Подтвердить заказ, нажав на кнопку "да"
    protected static final By BUTTON_RENT_ORDER_CONFIRMATION =
            By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
    //Поп-ап об успешном создании заказа
    public static final By ORDER_COMPLETED_IMAGE =
            By.xpath("//div[@class='Order_Modal__YZ-d3']/div[text()='Заказ оформлен']");
}
