package pages.catalogs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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


    public SourcesGroups clickCreate(){
        driver.findElement(createBtn).click();
        return this;
    }
    public SourcesGroups createSourceGroup(){
        driver.findElement(nameInput).sendKeys("Automation");
        driver.findElement(submitBtn).click();
        return this;
    }
    public SourcesGroups editSourceGroup() throws InterruptedException {
        driver.findElement(editBtn).click();
        driver.findElement(nameInput).clear();
        driver.findElement(nameInput).sendKeys("AutomationTest");
        driver.findElement(submitBtn).click();
        Thread.sleep(1000);
        return this;
    }
    public SourcesGroups deleteSourceGroup() throws InterruptedException {
        driver.findElement(deleteBtn).click();
        driver.findElement(confirmDeleteBtn).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        return this;
    }

}
