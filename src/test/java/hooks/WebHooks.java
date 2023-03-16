package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ResourceBundle;
import static com.codeborne.selenide.Selenide.open;
import static pageSteps.loginSteps.loginJira;


public class WebHooks {
private static ResourceBundle rb = ResourceBundle.getBundle("application");
    @BeforeAll
    static void setupAllureReports(){
          SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                  .screenshots(true)
                  .savePageSource(true)
          );
    }
        @BeforeEach
        public void openJira() {
            String website = rb.getString("website");
            String login = rb.getString("login");
            String password = rb.getString("password");
            Configuration.startMaximized = true;
            open(website);
            loginJira(login, password);
        }
        @AfterEach
        public void closeJira() {
        Selenide.closeWebDriver();
        }
}


