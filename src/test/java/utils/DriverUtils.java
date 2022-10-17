package utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

public class DriverUtils {
    public static void openBrowser(){
        Selenide.open("http://google.com");
    }

    public static void closeBrowser(){
        WebDriverRunner.closeWebDriver();
    }

    public static void browserConfiguration() {
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
