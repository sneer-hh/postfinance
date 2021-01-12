package vererbung.mit;

import org.junit.Assert;
import postfinance.DemoPage;
import postfinance.LoginPage;
import postfinance.PFMainPage;


public class Test extends WebdriverSetup2 {

    @org.junit.Test
    public void google() {

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
