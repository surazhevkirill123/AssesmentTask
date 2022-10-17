package utils;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    private static final WebDriver driver = WebDriverRunner.getWebDriver();
    private static final Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public static void sleepSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000L));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
