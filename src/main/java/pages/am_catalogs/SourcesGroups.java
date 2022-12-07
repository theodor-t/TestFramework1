package pages.am_catalogs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import pages.base.BasePage;

public class SourcesGroups extends BasePage {
    public SourcesGroups(WebDriver driver) {
        super(driver);
    }

    //CREATE
    private final By createBtn = By.xpath("//button[contains(text(),'Create')]");
    private final By nameInput = By.xpath("//input[@name='name']");
    private final By submitBtn = By.xpath("//button[@type='submit']");
    //EDIT
    private final By editBtn = By.xpath("(//button[@aria-label='Edit'])[1]");
    //DELETE
    private final By deleteBtn = By.xpath("(//button[@aria-label='Delete'])[1]");
    private final By confirmDeleteBtn = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeDialog MuiButton-containedSizeDialog MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeDialog MuiButton-containedSizeDialog MuiButton-disableElevation css-wj0gzz']");
    //ELEMENTS
    private final By headingText = By.xpath("//h3");
    private final By dataTable = By.xpath("//table[@class='MuiTable-root css-ea2l0y']");


    public SourcesGroups clickCreate() {
        driver.findElement(createBtn).click();
        return this;
    }

    public SourcesGroups createSourceGroup() {
        driver.findElements(nameInput);
        driver.findElement(nameInput).sendKeys("Automation");
        driver.findElement(submitBtn).click();
        return this;
    }

    public SourcesGroups editSourceGroup() {
        driver.findElement(editBtn).click();
        driver.findElement(nameInput).clear();
        driver.findElement(nameInput).sendKeys("AutomationTest");
        driver.findElement(submitBtn).click();
        return this;
    }

    public SourcesGroups deleteSourceGroup() {
        driver.findElement(deleteBtn).click();
        driver.findElement(confirmDeleteBtn).sendKeys(Keys.ENTER);
        return this;
    }

    public SourcesGroups checkIfExistElements() {
        //Boolean
        boolean createBtnPresence = driver.findElement(createBtn).isDisplayed();
        boolean headingTextPresence = driver.findElement(headingText).isDisplayed();
        boolean dataTablePresence = driver.findElement(dataTable).isDisplayed();
        if (createBtnPresence == true && headingTextPresence == true && dataTablePresence == true) {
            System.out.println("SourcesGroups is OK");

        } else {
            System.out.println("SourcesGroups is FAIL");
        }
        return this;
    }

}
