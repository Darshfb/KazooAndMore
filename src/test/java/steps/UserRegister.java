package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import pages.RegisterPage;

import static tests.TestBase.driver;


public class UserRegister {
    HomePage homePage;
    RegisterPage registerPage;
    Faker faker = new Faker();
    final String name = faker.name().firstName();
    final String lastName = faker.name().lastName();
    final String email = faker.internet().emailAddress();
    final String phone = "5" + faker.number().numberBetween(0, 0) + faker.number().digits(6);
    final String password = "AB" + faker.number().digits(6);


    @Given("User navigate to register page")
    public void User_navigate_to_register_page() {
        homePage = new HomePage(driver);
        homePage.navigateToRegisterPage();
    }

    @Then("User fill his data")
    public void User_fill_his_data() {
        registerPage = new RegisterPage(driver);
        System.out.println("Register Page opened");
    }

    @Then("Click on register")
    public void Click_on_register() {
        registerPage.userRegister(name, lastName, email, phone, password, password);

    }

    @Then("Navigate to home page")
    public void Navigate_to_home_page() {
        Assert.assertTrue(homePage.getName().contains(name));

    }
}
