import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;


public class Test {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                Paths.get("src/test/resources/chromedriver_win32/chromedriver.exe").toString());
        if (driver == null) {
            driver = new ChromeDriver();
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
    public void google() throws InterruptedException {
        driver.get("https://www.postfinance.ch/de/privat.html");
    PFMainPage pfMainPage = new PFMainPage();

    pfMainPage.clickOnLogin(driver);
    Thread.sleep(3000);
    Thread.sleep(3000);
    }

}
