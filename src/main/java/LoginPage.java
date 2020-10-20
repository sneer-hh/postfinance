import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class LoginPage {

    By demoVersion = xpath("//a[@class='link hideIfMobile openInOverlay']");


    public void clickOnLogin(WebDriver driver) {
        driver.findElement(demoVersion).click();
    }
}
