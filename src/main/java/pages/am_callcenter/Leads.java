package pages.am_callcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.am_catalogs.Brands;
import pages.base.BasePage;

public class Leads extends BasePage {
    public Leads(WebDriver driver) {
        super(driver);
    }

    private final By createBtn = By.xpath("//div/button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedError MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-disableElevation MuiButton-root MuiButton-outlined MuiButton-outlinedError MuiButton-sizeSmall MuiButton-outlinedSizeSmall MuiButton-disableElevation css-1dsx5f9']");
    private final By headingText = By.xpath("//h1");
    private final By dataTable = By.xpath("//form[@class='css-zqcn1z']");

    public Leads checkIfExistElements() {
        //Boolean
        boolean createBtnPresence = driver.findElement(createBtn).isDisplayed();
        boolean headingTextPresence = driver.findElement(headingText).isDisplayed();
        boolean dataTablePresence = driver.findElement(dataTable).isDisplayed();
        if (createBtnPresence == true && headingTextPresence == true && dataTablePresence == true) {
            System.out.println("Leads is OK");

        } else {
            System.out.println("Leads is FAIL");
        }
        return this;
    }
}
