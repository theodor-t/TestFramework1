package pages.am_callcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.am_catalogs.Companies;
import pages.base.BasePage;

public class Tasks extends BasePage {
    public Tasks(WebDriver driver) {
        super(driver);
    }

    private final By createBtn = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-r0sfkz']");
    private final By headingText = By.xpath("//h3");

    public Tasks checkIfExistElements() {
        //Boolean
        boolean createBtnPresence = driver.findElement(createBtn).isDisplayed();
        boolean headingTextPresence = driver.findElement(headingText).isDisplayed();
        if (createBtnPresence == true && headingTextPresence == true) {
            System.out.println("Tasks is OK");

        } else {
            System.out.println("Tasks is FAIL");
        }
        return this;
    }
}
