package pages.catalogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Sources extends BasePage {
    public Sources(WebDriver driver) {
        super(driver);
    }

    private final By nameInput = By.xpath("//input[@id=':rki:']");
    private final By socialMediaLinkInput = By.xpath("//input[@id=':rkj:']");
    private final By sourceGroupListBox = By.xpath("//div[@aria-haspopup='listbox']");
    private final By sourceGroupValue = By.xpath("//li[@data-value='1']");

    public Sources createSource(){
        driver.findElement(nameInput).sendKeys("Maxim");
        driver.findElement(socialMediaLinkInput).sendKeys("https://www.instagram.com/testing/");
        driver.findElement(sourceGroupListBox).click();
        driver.findElement(sourceGroupValue).click();
        return this;
    }
}
