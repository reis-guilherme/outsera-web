package outsera.web.configuration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.ScreenshotException;
import outsera.web.common.BaseTest;
import outsera.web.enums.Web;

import static outsera.web.common.BaseTest.driver;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest() {
        super.inicializarDriver(Web.CHROME);
    }

    @After
    public void afterTest(Scenario scenario) {
        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        } catch (ScreenshotException ex) {
            ex.printStackTrace();
        }
        driver.quit();

    }
}
