package postfinance;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class PFMainPage {

    By login = xpath("//*[@id=\"header\"]/div[2]/div[1]/div/div/div[3]/a[1]/i");
    By servicesUndSupportHeader = By.xpath("//*[@id=\"35dcd6\"]");

    //   public machmalwas.PFMainPage() {
    //   }

    public boolean isHeaderDisplayed(WebDriver driver) {
        boolean isHeaderDisplayed = false;
        try {
            isHeaderDisplayed = driver.findElement(servicesUndSupportHeader).isDisplayed();
        } catch (NoSuchElementException noSEE) {
            System.out.println("Element existiert nicht oder ist nicht sichtbar");
        }
        return isHeaderDisplayed;
    }

    public String getTextFromHeader(WebDriver driver) {
        return driver.findElement(servicesUndSupportHeader).getText();
    }

    public void clickOnLogin(WebDriver driver) {
        driver.findElement(login).click();
    }
}
