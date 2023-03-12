package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class testSeleniumElements {
    public static SelenideElement statusTask = $x ("//span[@id = 'status-val']");
    public static SelenideElement versionBinding  = $x ("//strong[@title = 'Затронуты версии']//following-sibling::span");
}
