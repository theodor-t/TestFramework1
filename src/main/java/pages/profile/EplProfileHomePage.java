package pages.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class EplProfileHomePage extends BasePage {
    public EplProfileHomePage(WebDriver driver) {
        super(driver);
    }

    private final By profileMenuBtn = By.xpath("//button[@atas='global__header_epl-user-menu-btn']");
    private final By logoutBtn = By.xpath("//a[@atas='global__navigation-logout-btn']");

    public EplProfileHomePage checkAuthorization() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(profileMenuBtn).click();
        Thread.sleep(2000);
        return this;
    }

    public EplProfileHomePage logout() throws InterruptedException {
        driver.findElement(logoutBtn).click();
        Thread.sleep(4000);
        return this;
    }
}
