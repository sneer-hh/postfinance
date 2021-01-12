package vererbung.ohne;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import postfinance.DemoPage;
import postfinance.LoginPage;
import postfinance.PFMainPage;


public class Test {

    //    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver",
//                Paths.get("src/test/resources/chromedriver_win32/chromedriver.exe").toString());
//        if (driver == null) {
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        }
//    }
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverSetup webDriverSetup = new WebDriverSetup();
        driver = webDriverSetup.setup();
    }

    @After
    public void tearDown() {
        new WebDriverSetup().tearDown(driver);
    }


//
//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.close();
//            driver.quit();
//        }
//    }

    @org.junit.Test
    public void google() {

        // vererbung.ohne.WebDriverSetup webDriverSetup = new vererbung.ohne.WebDriverSetup();
        // WebDriver driver = webDriverSetup.setUp();

        driver.get("https://www.postfinance.ch/de/privat.html");

        new PFMainPage().clickOnLogin(driver);

        LoginPage lp = new LoginPage();
        lp.clickOnDemoVersion(driver);

        // Thread.sleep(3000);

        DemoPage dp = new DemoPage();
        Assert.assertTrue("Header is empty or wrong", dp.isHeaderDisplayed(driver));
        //  Assert.assertEquals("Demo E-Finance und Loginverfahren", dp.getText(driver));

    }

}
