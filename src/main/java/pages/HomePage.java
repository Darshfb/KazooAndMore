package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='login d-none d-md-block']")
    WebElement loginTextButton;
    @FindBy(xpath = "//a[@class='main-btn main animate d-none d-md-block']")
    WebElement registerTextButton;

    @FindBy(xpath = "(//span[@class='text text-ellipsis'])[2]")
    WebElement name;



    public void navigateToLoginPage(){
        clickButton(loginTextButton);
    }
    public void navigateToRegisterPage(){
        clickButton(registerTextButton);
    }

    public String getName(){
        System.out.println(name.getText());
       return name.getText();
    }
}
