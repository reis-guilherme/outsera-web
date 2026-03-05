package outsera.web.common;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import outsera.web.interfaces.WebApplication;

import java.time.Duration;
import java.util.Locale;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public Faker faker = new Faker(new Locale("pt-BR"));

    protected void inicializarDriver(WebApplication webApplication){
        driver = webApplication.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
}
