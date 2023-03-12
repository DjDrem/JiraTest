package pageSteps;

import io.qameta.allure.Step;
import static pageElements.currentTasksElements.searchButton;
import static pageElements.currentTasksElements.searchTask;
import static pageElements.dashboardElements.taskSearch;
import static pageElements.dashboardElements.tasksTab;
import static pageElements.testSeleniumElements.statusTask;

public class testSeleniumSteps {
    @Step("Проверка статуса проекта {input}")
    public static void statusCheck (String input){
        tasksTab.click();
        taskSearch.click();
        searchTask.sendKeys(input);
        searchButton.click();
        statusTask.click();
    }
}
