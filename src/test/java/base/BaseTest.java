package base;

import config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;


public class BaseTest extends TestConfig {

    protected WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.booking.com");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
