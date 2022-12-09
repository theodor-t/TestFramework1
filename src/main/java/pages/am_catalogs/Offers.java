package pages.am_catalogs;

import common.RandomValues;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class Offers extends BasePage {
    public Offers(WebDriver driver) {
        super(driver);
    }

    private final By createBtn = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-r0sfkz']");
    private final By countrySelect = By.xpath("//div[@name='country_id']");
    private final By countryOption = By.xpath("//li[@data-value='1']");
    private final By employerSelect = By.xpath("//div[@name='employer_id']");
    private final By employerOption = By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-schsvu'])[1]");
    private final By offerCodeInput = By.xpath("//input[@name='code']");
    private final By offerNameInput = By.xpath("//input[@name='name']");
    private final By salaryAmountInput = By.xpath("//input[@name='salary_amount']");
    private final By salaryCurrencySelect = By.xpath("//div[@id='mui-component-select-salary_currency']");
    private final By salaryCurrencyOption = By.xpath("//li[@data-value='EUR']");
    private final By contractDurationSelect = By.xpath("//div[@id='mui-component-select-contract_duration']");
    private final By contractDurationOption = By.xpath("(//li[@role='option'])[1]");
    private final By workingDaysSelect = By.xpath("//div[@id='mui-component-select-working_days']");
    private final By workingDaysOption = By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-schsvu'])[1]");
    private final By workingHoursFromSelect = By.xpath("//div[@id='mui-component-select-working_hours_from']");
    private final By workingHoursFromOption = By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-schsvu'])[1]");
    private final By workingHoursToSelect = By.xpath("//div[@id='mui-component-select-working_hours_to']");
    private final By workingHoursToOption = By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-schsvu'])[1]");
    private final By mealsIncludeSelect = By.xpath("//div[@id='mui-component-select-meals_includes']");
    private final By mealsIncludeOption = By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-schsvu'])[1]");
    private final By houseIncludeSelect = By.xpath("//div[@id='mui-component-select-housing_included']");
    private final By houseIncludeOption = By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-schsvu'])[1]");
    private final By employeeTypeSelect = By.xpath("//div[@id='mui-component-select-employee_type']");
    private final By employeeTypeOption = By.xpath("//li[@data-value='M']");
    private final By ageFromInput = By.xpath("//input[@name='age_from']");
    private final By ageToInput = By.xpath("//input[@name='age_to']");
    private final By passportTypeSelect = By.xpath("//div[@id='mui-component-select-passport_type']");
    private final By passportTypeOption = By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-schsvu'])[1]");
    private final By professionSelect = By.xpath("//div[@id='mui-component-select-profession_id']");
    private final By professionOption = By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-schsvu'])[1]");
    private final By submitBtn = By.xpath("//button[@type='submit']");
    private final By headingText = By.xpath("//h3");
    private final By dataTable = By.xpath("//table[@class='MuiTable-root css-ea2l0y']");

    public Offers clickCreate() {
        //WAIT APPEAR CREATE BUTTON
        WebElement btnCreate = driver.findElement(createBtn);
        waitElementIsVisible(btnCreate).click();
        return this;
    }

    public Offers createOffer() {
        //WAIT APPEAR countrySelect
        WebElement selectCountry = driver.findElement(countrySelect);
        waitElementIsVisible(selectCountry).click();
        driver.findElement(countryOption).click();
        driver.findElement(employerSelect).click();
        driver.findElement(employerOption).click();
        driver.findElement(offerCodeInput).sendKeys(RandomValues.generateRandomNumber(RandomValues.TEN_DIGIT));
        driver.findElement(offerNameInput).sendKeys(RandomValues.appendRandomString("Test Automation "));
        driver.findElement(salaryAmountInput).sendKeys(RandomValues.generateRandomNumber(RandomValues.FIVE_DIGIT));
        driver.findElement(salaryCurrencySelect).click();
        driver.findElement(salaryCurrencyOption).click();
        driver.findElement(contractDurationSelect).click();
        driver.findElement(contractDurationOption).click();
        driver.findElement(workingDaysSelect).click();
        driver.findElement(workingDaysOption).click();
        driver.findElement(workingHoursFromSelect).click();
        driver.findElement(workingHoursFromOption).click();
        driver.findElement(workingHoursToSelect).click();
        driver.findElement(workingHoursToOption).click();
        driver.findElement(mealsIncludeSelect).click();
        driver.findElement(mealsIncludeOption).click();
        driver.findElement(houseIncludeSelect).click();
        driver.findElement(houseIncludeOption).click();
        driver.findElement(employeeTypeSelect).click();
        driver.findElement(employeeTypeOption).click();
        driver.findElement(employeeTypeOption).sendKeys(Keys.ESCAPE);
        driver.findElement(ageFromInput).sendKeys(RandomValues.generateRandomNumber(RandomValues.TWO_DIGIT));
        driver.findElement(ageToInput).sendKeys(RandomValues.generateRandomNumber(RandomValues.TWO_DIGIT));
        driver.findElement(passportTypeSelect).click();
        driver.findElement(passportTypeOption).click();
        driver.findElement(professionSelect).click();
        driver.findElement(professionOption).click();
        driver.findElement(submitBtn).click();
        //WAIT APPEAR CREATE BUTTON
        WebElement btnCreate = driver.findElement(createBtn);
        waitElementIsVisible(btnCreate).isDisplayed();
        return this;
    }

    public Offers checkIfExistElements() {
        //Boolean
        boolean createBtnPresence = driver.findElement(createBtn).isDisplayed();
        boolean headingTextPresence = driver.findElement(headingText).isDisplayed();
        boolean dataTablePresence = driver.findElement(dataTable).isDisplayed();
        if (createBtnPresence == true && headingTextPresence == true && dataTablePresence == true) {
            System.out.println("Offers is OK");

        } else {
            System.out.println("Offers is FAIL");
        }
        return this;
    }
}
