import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class TestPfMainPage {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                Paths.get("src/test/resources/chromedriver_win32/chromedriver.exe").toString());
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @org.junit.Test
    public void dingsda() {
        driver.get("https://www.postfinance.ch/de/privat.html");

        //new PFMainPage().isHeaderDisplayed(driver);
        //Assert.assertTrue(new PFMainPage().isHeaderDisplayed());
        Assert.assertTrue(new PFMainPage().isHeaderDisplayed(driver));
        Assert.assertEquals("Falscher Headertext", "Services und Support", new PFMainPage().getTextFromHeader(driver));
    }

}
