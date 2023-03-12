package pageSteps;

import io.qameta.allure.Step;

import static pageElements.bagElements.*;
import static pageElements.dashboardElements.createButton;
import static pageElements.dashboardElements.tasksTab;

public class bagSteps {
    @Step("Создание бага")
    public static void createBug (String theme, String description, String environment){
        createButton.click();
        bugTheme.sendKeys(theme);
        descriptionBug.click();
        descriptionBug.sendKeys(description);
        environmentBug.click();
        environmentBug.sendKeys(environment);
        buttonAppointMe.click();
        createButon.click();
        tasksTab.click();
        openTask.click();
    }

    @Step("Изменение статуса бага")
    public static void changestatusBug (){
        tasksTab.click();
        openTask.click();
        bisnessProcess.click();
        workProcees.click();
        confirmWorkProcess.click();
    }

    @Step("Закрытие бага")
    public static void closeBug (){
        tasksTab.click();
        openTask.click();
        bisnessProcess.click();
        markCompleted.click();
    }
}
