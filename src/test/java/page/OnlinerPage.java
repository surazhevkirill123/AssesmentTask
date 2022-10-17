package page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;

public class OnlinerPage {

    private final String ONLINER_URL ="https://www.onliner.by";
    private final WebElement enterButton = Selenide.$x("//div[contains(text(),'Вход')]");

    public void navigate()
    {
        Selenide.open(ONLINER_URL);
    }

    public void clickEnterButton(){
        enterButton.click();
    }
}
