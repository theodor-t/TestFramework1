package pages.am_catalogs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
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


    public SourcesGroups clickCreate() {
        driver.findElement(createBtn).click();
        return this;
    }

    public SourcesGroups createSourceGroup() throws InterruptedException {
        try {
            driver.findElements(nameInput);
            driver.findElement(nameInput).sendKeys("Automation");
            driver.findElement(submitBtn).click();
            System.out.println(nameInput + "Element present");
        } catch (NoSuchElementException e) {
            //Element is not present
            System.out.println(nameInput + "Element not present");
        }

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

}
