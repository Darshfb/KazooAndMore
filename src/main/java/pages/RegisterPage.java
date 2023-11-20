package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    WebElement email;

    @FindBy(xpath = "//input[@type='tel']")
    WebElement phone;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    WebElement password;
    @FindBy(xpath = "//input[@formcontrolname='confirmPassword']")
    WebElement confirmPassword;

    @FindBy(id = "agree")
    WebElement agree;

    @FindBy(css = ".main-btn.main.animate.w-100.border-0")
    WebElement registerButton;

    public void userRegister(String name, String lstName, String mail, String phoneNo, String pass, String confirmPass) {
        sendTextElement(firstName, name);
        sendTextElement(lastName, lstName);
        sendTextElement(email, mail);
        sendTextElement(phone, phoneNo);
        sendTextElement(password, pass);
        sendTextElement(confirmPassword, confirmPass);
        clickButton(agree);
        clickButton(registerButton);
    }
}
