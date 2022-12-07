package pages.am_catalogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CompanyOffices extends BasePage {
    public CompanyOffices(WebDriver driver) {
        super(driver);
    }

    private final By createBtn = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-r0sfkz'])[1]");
    private final By bookingsBtn = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-r0sfkz'])[2]");
    private final By headingText = By.xpath("//h3");
    private final By dataTable = By.xpath("//table[@class='MuiTable-root css-ea2l0y']");

    public CompanyOffices checkIfExistElements() {
        //Boolean
        boolean createBtnPresence = driver.findElement(createBtn).isDisplayed();
        boolean bookingsBtnPresence = driver.findElement(bookingsBtn).isDisplayed();
        boolean headingTextPresence = driver.findElement(headingText).isDisplayed();
        boolean dataTablePresence = driver.findElement(dataTable).isDisplayed();
        if (createBtnPresence == true && headingTextPresence == true && dataTablePresence == true && bookingsBtnPresence == true) {
            System.out.println("CompanyOffices is OK");

        } else {
            System.out.println("CompanyOffices is FAIL");
        }
        return this;
    }
}
