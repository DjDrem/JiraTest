package pageSteps;

import io.qameta.allure.Step;
import static pageElements.dashboardElements.currentProject;
import static pageElements.dashboardElements.projectTab;

public class numberTaskStep {
    @Step("Расчет общего количества задач")
    public static void numberTask(){
        projectTab.click();
        currentProject.click();
    }
}
