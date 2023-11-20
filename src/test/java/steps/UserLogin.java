package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

import static tests.TestBase.driver;

public class UserLogin {
    HomePage homePage;
    LoginPage loginPage;

    @Given("User opens home page")
    public void User_opens_home_page() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @When("User fill email {string} and password {string} to can login")
    public void User_fill_email_and_password_to_can_login(String email, String password) {
        homePage.navigateToLoginPage();
        loginPage.userLogin(email, password);
    }

    @Then("User should navigate to home page")
    public void User_should_navigate_to_home_page() {
        Assert.assertEquals("Mostafa AaaaQA", homePage.getName());
    }
}
