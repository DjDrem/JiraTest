package pageSteps;

import io.qameta.allure.Step;
import static pageElements.loginElements.*;

public class loginSteps {
    @Step("авторизация на сайте {login} с паролем {password}")
    public static void loginJira (String login, String password){
        loginEdujira.sendKeys(login);
        passwordEdujira.sendKeys(password);
        entryEdujira.click();
    }
}
