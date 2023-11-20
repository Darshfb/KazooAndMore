package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@type='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='password-field']")
    WebElement passwordField;
    @FindBy(xpath = "//a[@class='small']")
    WebElement forgetPasswordTextButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement loginButton;

    @FindBy(xpath = "//a[@class='semibold.main-color.fs-15']")
    WebElement continueAsGuestButton;


    public void userLogin(String email, String password) {
        sendTextElement(emailField, email);
        sendTextElement(passwordField, password);
        clickButton(loginButton);
    }


}
