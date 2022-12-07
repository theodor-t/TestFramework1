package pages.am_catalogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Professions extends BasePage {
    public Professions(WebDriver driver) {
        super(driver);
    }

    private final By createBtn = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-r0sfkz']");
    private final By headingText = By.xpath("//h3");
    private final By dataTable = By.xpath("//table[@class='MuiTable-root css-ea2l0y']");

    public Professions checkIfExistElements() {
        //Boolean
        boolean createBtnPresence = driver.findElement(createBtn).isDisplayed();
        boolean headingTextPresence = driver.findElement(headingText).isDisplayed();
        boolean dataTablePresence = driver.findElement(dataTable).isDisplayed();
        if (createBtnPresence == true && headingTextPresence == true && dataTablePresence == true) {
            System.out.println("Professions is OK");

        } else {
            System.out.println("Professions is FAIL");
        }
        return this;
    }
}
