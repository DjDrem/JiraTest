package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class dashboardElements {
    //    Вкладка Рабочий стол
    public static SelenideElement desktopTab = $x ("//a[@accesskey = 'D']");
    //   Вкладка Проекты
    public static SelenideElement projectTab = $x ("//a[@accesskey = 'P']");
    //    Вкладка Задачи
    public static SelenideElement tasksTab = $x ("//a[@accesskey = 'I']");
    public static  SelenideElement taskSearch = $x ("//a[contains(text(), 'Поиск задач')]");
    //    Кнопка Создать
    public static  SelenideElement createButton = $x ("//a[text() = 'Создать']");
    // вкладка текущие проекты
    public static SelenideElement currentProject = $x ("//div[@id = 'project_current']" +
            "//following-sibling::ul//child::li//child::a");
}
