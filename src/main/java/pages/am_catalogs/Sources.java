package pages.am_catalogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Sources extends BasePage {
    public Sources(WebDriver driver) {
        super(driver);
    }

    private final By createBtn = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-r0sfkz']");
    private final By headingText = By.xpath("//h3");
    private final By dataTable = By.xpath("//table[@class='MuiTable-root css-ea2l0y']");

    /*private final By nameInput = By.xpath("//input[@id=':rki:']");
    private final By socialMediaLinkInput = By.xpath("//input[@id=':rkj:']");
    private final By sourceGroupListBox = By.xpath("//div[@aria-haspopup='listbox']");
    private final By sourceGroupValue = By.xpath("//li[@data-value='1']");*/

  /*  public Sources createSource() {
        driver.findElement(nameInput).sendKeys("Maxim");
        driver.findElement(socialMediaLinkInput).sendKeys("https://www.instagram.com/testing/");
        driver.findElement(sourceGroupListBox).click();
        driver.findElement(sourceGroupValue).click();
        return this;
    }*/

    public Sources checkIfExistElements() {
        //Boolean
        boolean createBtnPresence = driver.findElement(createBtn).isDisplayed();
        boolean headingTextPresence = driver.findElement(headingText).isDisplayed();
        boolean dataTablePresence = driver.findElement(dataTable).isDisplayed();
        if (createBtnPresence == true && headingTextPresence == true && dataTablePresence == true) {
            System.out.println("Sources is OK");

        } else {
            System.out.println("Sources is FAIL");
        }
        return this;
    }
}
