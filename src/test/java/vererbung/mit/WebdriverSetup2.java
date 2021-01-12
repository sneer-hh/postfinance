package vererbung.mit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import vererbung.ohne.WebDriverSetup;

public class WebdriverSetup2 {

    protected WebDriver driver;

    @Before
    public void setUp() {
        WebDriverSetup webDriverSetup = new WebDriverSetup();
        driver = webDriverSetup.setup();
    }

    @After
    public void tearDown() {
        new WebDriverSetup().tearDown(driver);
    }

}
