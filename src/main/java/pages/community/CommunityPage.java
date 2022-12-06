package pages.community;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.epzone_home.EpZoneHomePage;

public class CommunityPage extends BasePage {

    public CommunityPage(WebDriver driver) {
        super(driver);
    }

    private final By signInBtn = By.xpath("//header[@id=\"js-ep-header\"]/div[3]/div/div[1]/div[2]/a");

    public CommunityPage logInCommunityPage() throws InterruptedException {
        driver.findElement(signInBtn).click();
        Thread.sleep(2000);
        return this;
    }
}
