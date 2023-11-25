//package steps;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeAll;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeSuite;
//
//import java.time.Duration;
//
//public class TestBase {
//
//    public static WebDriver driver;
//
//    @Before
//    public void startDriver() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
//        driver.get("http://kazoositedev.softlinktest.com/home");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
//
//    }
//
//    @After
//    public void stopDriver() {
//        driver.quit();
//    }
//}
