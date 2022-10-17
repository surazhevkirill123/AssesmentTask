package page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;

public class OnlinerLoginPage {
    private final WebElement emailField = Selenide.$x("//input[contains(@placeholder,'e-mail')]");
    private final WebElement passwordField = Selenide.$x("//input[@type='password']");
    private final WebElement submitButton = Selenide.$x("//button[contains(text(),'Войти')]");

    public OnlinerLoginPage fillEmailField(String email){
        emailField.sendKeys(email);
        return this;
    }

    public OnlinerLoginPage fillPasswordField(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public void clickSubmitButton(){
        submitButton.click();
    }
}
