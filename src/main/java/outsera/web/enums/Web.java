package outsera.web.enums;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import outsera.web.interfaces.WebApplication;

import java.util.HashMap;
import java.util.Map;

public enum Web implements WebApplication {

    CHROME {
        @Override
        public WebDriver getDriver() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--guest");
            return new ChromeDriver(chromeOptions);
        }
    },
    FIREFOX {
        @Override
        public WebDriver getDriver() {
            WebDriverManager.chromedriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--headless");
            return new FirefoxDriver(firefoxOptions);
        }
    }
}
