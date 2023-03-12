package pageSteps;

import io.qameta.allure.Step;
import static pageElements.dashboardElements.currentProject;
import static pageElements.dashboardElements.projectTab;

public class goToTestProjectStep {
    @Step("Переход в проект TestProject")
    public static void testProject (){
        projectTab.click();
        currentProject.click();
    }
}
