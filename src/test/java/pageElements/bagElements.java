package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class bagElements {
    public static SelenideElement bugTheme = $x ("//label[@for = 'summary']//following-sibling::input");
    //    Описание
    public static SelenideElement descriptionBug = $x ("//textarea[@name = 'description']");
    //    Окружение
    public static SelenideElement environmentBug = $x ("//textarea[@id = 'environment']");
    //    Кнопка назначить меня
    public static SelenideElement buttonAppointMe = $x ("//button[text() = 'Назначить меня']");
    //    Создать
    public static SelenideElement createButon = $x ("//input[@accesskey = 'S']");
    //    Мои открытые задачи
    public static SelenideElement openTask = $x ("//a[text() = 'Мои открытые задачи']");
    //    отметка в работе
    public static SelenideElement workProcees = $x ("//span[text() = 'В процессе']");
    //     Вкладка бизнес-процесс
    public static SelenideElement bisnessProcess = $x ("//span[text() = 'Бизнес-процесс']");
    //    отметка Выполнено
    public static SelenideElement markCompleted = $x ("//span[text() = 'Выполнено']");
    // кнопка подтверждения в процессе
    public static SelenideElement confirmWorkProcess = $x ("//input[@value = 'В процессе']");
}
