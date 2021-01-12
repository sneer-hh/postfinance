package vererbung.ohne;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import postfinance.PFMainPage;


public class TestPfMainPage {
    private WebDriver driver;
    private WebDriverSetup webDriverSetup = new WebDriverSetup();


    //    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver",
//                Paths.get("src/test/resources/chromedriver_win32/chromedriver.exe").toString());
//        if (driver == null) {
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        }
//    }
//
//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.close();
//            driver.quit();
//        }
//    }
    @Before
    public void setUp() {
        driver = webDriverSetup.setup();
    }

    @After
    public void tearDown() {
        webDriverSetup.tearDown(driver);
    }

    @org.junit.Test
    public void dingsda() {
        driver.get("https://www.postfinance.ch/de/privat.html");

        //new machmalwas.PFMainPage().isHeaderDisplayed(driver);
        //Assert.assertTrue(new machmalwas.PFMainPage().isHeaderDisplayed());
        Assert.assertTrue(new PFMainPage().isHeaderDisplayed(driver));
        Assert.assertEquals("Falscher Headertext", "Services und Support", new PFMainPage().getTextFromHeader(driver));
    }

    @Test
    public void ifTest() {
        driver.get("https://www.postfinance.ch/de/privat.html");
        PFMainPage pfMainPage = new PFMainPage();
        if (pfMainPage.isHeaderDisplayed(driver)) {
            System.out.println("ich klicke hier");
        } else {
            System.out.println("Ich klicke woanders hin");
        }
    }
}
