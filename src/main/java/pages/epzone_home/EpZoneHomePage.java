package pages.epzone_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import static constants.Constant.Accounts.*;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class EpZoneHomePage extends BasePage {

    public EpZoneHomePage(WebDriver driver) {
        super(driver);
    }

    private final By signInButton = By.xpath("//button[@atas='global__header-login-btn']");
    private final By emailInput = By.xpath("//input[@atas='login__form-email_popup']");
    private final By passInput = By.xpath("//input[@atas='login__form-password_popup']");
    private final By loginBtnHomePage = By.xpath("//button[@atas='login__form-submit_popup']");
    private final By clearSessionBtn = By.xpath("//span[@id='js-clean-session-btn']");
    private final By stayCheckBox = By.xpath("//label[@atas='login__form-checkbox_popup']");
    private final By goToEplBtn = By.xpath("//button[@class='btn btn-primary bootstrap4-dialog-button']");

    //Accounts type
    private final By buyerAccount = By.xpath("//div[@atas='global__select-account-buyer']");
    private final By manufacturerAccount = By.xpath("//div[@atas='global__select-account-manufacturer']");
    private final By sellerAccount = By.xpath("//div[@atas='global__select-account-seller']");


    public EpZoneHomePage logInHomePage() throws InterruptedException {
        driver.findElement(signInButton).click();
        Thread.sleep(2000);
        driver.findElement(emailInput).click();
        return this;
    }

    public EpZoneHomePage selectSingleAccount() {
        driver.findElement(emailInput).sendKeys(EMAIL_SINGLEACC);
        driver.findElement(passInput).sendKeys(PASSWORD_SINGLEACC);
        return this;
    }

    public EpZoneHomePage selectMultiAccount() {
        driver.findElement(emailInput).sendKeys(EMAIL_MULTIACC);
        driver.findElement(passInput).sendKeys(PASSWORD_MULTIACC);
        return this;
    }

    public EpZoneHomePage selectShipperAccount() {
        driver.findElement(emailInput).sendKeys(EMAIL_EPL_ACCOUNT);
        driver.findElement(passInput).sendKeys(PASSWORD_EPL_ACCOUNT);
        return this;
    }

    public EpZoneHomePage buyerAccount() {
        driver.findElement(buyerAccount).click();
        return this;
    }

    public EpZoneHomePage sellerAccount() {
        driver.findElement(sellerAccount).click();
        return this;
    }

    public EpZoneHomePage manufacturerAccount() {
        driver.findElement(manufacturerAccount).click();
        return this;
    }


    public EpZoneHomePage clickLoginHomePage() throws InterruptedException {
        driver.findElement(loginBtnHomePage).click();
        //WebElement btnLogin = driver.findElement(loginBtnHomePage);
        //waitElementIsVisible(btnLogin).click();
        Thread.sleep(4000);
        return this;
    }

    public EpZoneHomePage staySigned() {
        driver.findElement(stayCheckBox).click();
        return this;
    }

    public EpZoneHomePage checkSession() throws InterruptedException {
        WebElement sessionBtn = driver.findElement(clearSessionBtn);
        waitElementIsVisible(sessionBtn).click();
        Thread.sleep(3000);
        return this;
    }

    public EpZoneHomePage goToEpl() throws InterruptedException {
        driver.findElement(goToEplBtn).click();
        Thread.sleep(3000);
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
