import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class PFMainPage {

    By login = xpath("//*[@id=\"header\"]/div[2]/div[1]/div/div/div[3]/a[1]/i");

    public PFMainPage() {
    }

    public void clickOnLogin(WebDriver driver) {
        driver.findElement(login).click();
    }
}
