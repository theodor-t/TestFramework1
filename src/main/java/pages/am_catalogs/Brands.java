package pages.am_catalogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Brands extends BasePage {
    public Brands(WebDriver driver) {
        super(driver);
    }

    // dummy comment
    private final By createBtn = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-r0sfkz']");
    private final By headingText = By.xpath("//h3");
    private final By dataTable = By.xpath("//table[@class='MuiTable-root css-ea2l0y']");

    public Brands checkIfExistElements() {
        //Boolean
        boolean createBtnPresence = driver.findElement(createBtn).isDisplayed();
        boolean headingTextPresence = driver.findElement(headingText).isDisplayed();
        boolean dataTablePresence = driver.findElement(dataTable).isDisplayed();
        if (createBtnPresence == true && headingTextPresence == true && dataTablePresence == true) {
            System.out.println("Brands is OK");

        } else {
            System.out.println("Brands is FAIL");
        }
        return this;
    }
}
