package runner;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        dryRun = true)
public class TestRunner extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @Before
    public void startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.get("http://kazoositedev.softlinktest.com/home");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

    }

    @After
    public void stopDriver() {
        driver.quit();
    }
}
