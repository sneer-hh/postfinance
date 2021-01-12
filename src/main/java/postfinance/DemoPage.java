package postfinance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoPage {

    By header = By.xpath("//*[@id='main-content']/div[1]/div");
    By headerText = By.xpath("//*[@id='header']/div[1]/nav/ul/li[1]/a");

    public boolean isHeaderDisplayed(WebDriver driver) {
        return driver.findElement(header).isDisplayed();
    }

    public String getText(WebDriver driver) {
        return driver.findElement(headerText).getText();
    }


//    public boolean assertText(WebDriver driver) {
//        boolean isTextdisplayed =  driver.findElement(header).isDisplayed();
//        return isTextdisplayed;
//    }

}

