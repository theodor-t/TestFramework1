package pages.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.epzone_home.EpZoneHomePage;

import static constants.Constant.Accounts.*;
import static constants.Constant.Accounts.PASSWORD_MULTIACC;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class EpZoneLoginPage extends BasePage {
    public EpZoneLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailInput = By.xpath("//input[@atas='login__form-email']");
    private final By passInput = By.xpath("//input[@atas='login__form-password']");
    private final By loginBtn = By.xpath("//button[@atas='login__form-submit']");
    private final By staySignedCheckbox = By.xpath("//label[@atas='login__form-checkbox']");
    private final By clearSessionBtn = By.xpath("//span[@id='js-clean-session-btn']");

    //Accounts type
    private final By buyerAccount = By.xpath("//div[@atas='global__select-account-buyer']");
    private final By manufacturerAccount = By.xpath("//div[@atas='global__select-account-manufacturer']");
    private final By sellerAccount = By.xpath("//div[@atas='global__select-account-seller']");


    public EpZoneLoginPage selectSingleAccount() {
        driver.findElement(emailInput).sendKeys(EMAIL_SINGLEACC);
        driver.findElement(passInput).sendKeys(PASSWORD_SINGLEACC);
        return this;
    }

    public EpZoneLoginPage selectMultiAccount() {
        driver.findElement(emailInput).sendKeys(EMAIL_MULTIACC);
        driver.findElement(passInput).sendKeys(PASSWORD_MULTIACC);
        return this;
    }

    public EpZoneLoginPage buyerAccount() {
        driver.findElement(buyerAccount).click();
        return this;
    }

    public EpZoneLoginPage sellerAccount() {
        driver.findElement(sellerAccount).click();
        return this;
    }

    public EpZoneLoginPage manufacturerAccount() {
        driver.findElement(manufacturerAccount).click();
        return this;
    }

    public EpZoneLoginPage staySigned() throws InterruptedException {
        driver.findElement(staySignedCheckbox).click();
        Thread.sleep(2000);
        return this;
    }

    public EpZoneLoginPage clickLogin() throws InterruptedException {
        driver.findElement(loginBtn).click();
        Thread.sleep(4000);
        return this;
    }

    public Boolean hasClearSessionButton() {
        try {
            WebElement sessionBtn = driver.findElement(clearSessionBtn);
            WebDriverWait delay = new WebDriverWait(driver, EXPLICIT_WAIT);

            return delay.until(ExpectedConditions.visibilityOf(sessionBtn)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
