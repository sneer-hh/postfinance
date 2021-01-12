package vererbung.ohne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class WebDriverSetup {


    // @Before
    public WebDriver setup() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver",
                Paths.get("src/test/resources/chromedriver_win32/chromedriver.exe").toString());
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        return driver;
    }

    //  @After
    public void tearDown(WebDriver driver) {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
