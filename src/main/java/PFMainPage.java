import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class PFMainPage {

    By login = xpath("//*[@id=\"header\"]/div[2]/div[1]/div/div/div[3]/a[1]/i");
    By headerText = By.xpath("//*[@id=\"35dcd6\"]");

    //   public PFMainPage() {
    //   }


    public boolean isHeaderDisplayed(WebDriver driver) {
        return driver.findElement(headerText).isDisplayed();
    }

    public String getTextFromHeader(WebDriver driver) {
        return driver.findElement(headerText).getText();
    }

    public void clickOnLogin(WebDriver driver) {
        driver.findElement(login).click();
    }
}
