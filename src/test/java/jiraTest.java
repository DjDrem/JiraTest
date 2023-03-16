import com.codeborne.selenide.Condition;
import hooks.WebHooks;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ResourceBundle;

import static com.codeborne.selenide.Selenide.sleep;
import static pageElements.currentTasksElements.numberRunningTask;
import static pageElements.dashboardElements.*;
import static pageElements.testSeleniumElements.statusTask;
import static pageElements.testSeleniumElements.versionBinding;
import static pageSteps.bagSteps.*;
import static pageSteps.goToTestProjectStep.testProject;
import static pageSteps.numberTaskStep.numberTask;
import static pageSteps.testSeleniumSteps.statusCheck;

@Feature("JiraTest")
public class jiraTest extends WebHooks {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
    private static ResourceBundle rb = ResourceBundle.getBundle("application");
    @Test
    @DisplayName("Тест авторизации jira")
    @Epic("Jira")
    @Story("Авторизация")
    @Description("Авторизация путем введения логина и пароля полученного из application.properties")
    public void LoginTest(){
        desktopTab.shouldBe(Condition.visible, Duration.ofSeconds(3));
        Assertions.assertEquals("Проекты", projectTab.getText());
    }

    @Test
    @DisplayName("Тест перехода в проект TestProject")
    @Epic("Jira")
    @Story("Проект")
    @Description("Переход в проект TestProject")
    public void ProjectTest(){
        testProject();
        numberRunningTask.shouldBe(Condition.exist);
    }

    @Test
    @DisplayName("Тест вычисления общего количества задач")
    @Epic("Jira")
    @Story("Расчеты")
    @Description("Поиск и отображение общего количества заведенных задач")
    public void totalNumberTask (){
        numberTask();
        String count = numberRunningTask.getText();
        Assertions.assertNotNull(numberRunningTask);
        Assertions.assertEquals(numberRunningTask.getText(), count, "Всего задач: ");
    }

    @Test
    @DisplayName("Тест проверки статуса проекта")
    @Epic("Jira")
    @Story("статус проекта")
    @Description("Поиск и отображение статуса проекта")
    public void statusCheckTask() {
        String nameTask = rb.getString("nameTask");
        statusCheck(nameTask);
        String status = statusTask.getText();
        String version = versionBinding.getText();
        Assertions.assertEquals("Version 2.0", versionBinding.getText(), "Проверка версии");
    }

    @Test
    @DisplayName("Тест создания Бага")
    @Epic("Jira")
    @Story("Создание бага")
    @Description("Открытие формы и ввод темы и описаия проблемы через xpath")
    public void bugCreate(){
        String theme = rb.getString("theme");
        String description = rb.getString("description");
        String environment = rb.getString("environment");
        createBug(theme, description, environment);
        Assertions.assertEquals("СДЕЛАТЬ", statusTask.getText());
    }
    @Test
    @DisplayName("Тест измененя статуса бага")
    @Epic("Jira")
    @Story("Изменение статуса")
    @Description("Принятие в работу проекта")
    public void bugChange(){
        sleep(2000);
        changestatusBug ();
        Assertions.assertEquals("В РАБОТЕ", statusTask.getText());
    }
    @Test
    @DisplayName("Тест закрытия проекта")
    @Epic("Jira")
    @Story("Закрытие проекта")
    @Description("Перевод статуса проекта в разряд выплнено")
    public void bugClose(){
        sleep(3000);
        closeBug ();
        Assertions.assertEquals("ГОТОВО", statusTask.getText());
    }
}
