package pages.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ProfileHomePage extends BasePage {

    public ProfileHomePage(WebDriver driver) {
        super(driver);
    }

    private final By profileImage = By.xpath("//button[@class='epuser-line__user-img call-action']");
    private final By logoutBtn = By.xpath("//a[@data-js-action='dashboard:logout']");

    public ProfileHomePage checkAuthorization() {
        driver.findElement(profileImage).click();
        return this;
    }

    public ProfileHomePage logout() throws InterruptedException {
        driver.findElement(logoutBtn).click();
        Thread.sleep(6000);
        return this;
    }

}
