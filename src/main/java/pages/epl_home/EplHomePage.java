package pages.epl_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.epzone_home.EpZoneHomePage;

import static constants.Constant.Accounts.*;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class EplHomePage extends BasePage {
    public EplHomePage(WebDriver driver) {
        super(driver);
    }

    private final By signInEplButton = By.xpath("//button[@atas='global__header_epl-login-btn']");
    private final By emailInput = By.xpath("//input[@atas='epl-login__form_email-input_popup']");
    private final By passInput = By.xpath("//input[@atas='epl-login__form_password-input_popup']");
    private final By stayCheckBox = By.xpath("//label[@atas='epl-login__form_checkbox_popup']");
    private final By signInButton = By.xpath("//button[@atas='epl-login__form_submit-btn_popup']");
    private final By clearSessionBtn = By.xpath("//button[@atas='epl-login__form-clear-session-btn']");
    private final By goToEp = By.xpath("//button[@class='btn fancybox-dialog__button btn-primary']");

    public EplHomePage loginEplHomePage() throws InterruptedException {
        driver.findElement(signInEplButton).click();
        Thread.sleep(2000);
        return this;
    }

    public EplHomePage selectAccount() throws InterruptedException {
        driver.findElement(emailInput).sendKeys(EMAIL_EPL_ACCOUNT);
        driver.findElement(passInput).sendKeys(PASSWORD_EPL_ACCOUNT);
        Thread.sleep(2000);
        return this;
    }

    public EplHomePage selectEpZoneAccount() throws InterruptedException {
        driver.findElement(emailInput).sendKeys(EMAIL_SINGLEACC);
        driver.findElement(passInput).sendKeys(PASSWORD_SINGLEACC);
        Thread.sleep(2000);
        return this;
    }

    public EplHomePage staySigned() {
        driver.findElement(stayCheckBox).click();
        return this;
    }

    public EplHomePage signInBtn() throws InterruptedException {
        driver.findElement(signInButton).click();
        Thread.sleep(4000);
        return this;
    }

    public EplHomePage goToEp() throws InterruptedException {
        driver.findElement(goToEp).click();
        Thread.sleep(4000);
        return this;
    }


    public EplHomePage checkSessionEpl() {
        WebElement sessionBtn = driver.findElement(clearSessionBtn);
        waitElementIsVisible(sessionBtn).click();
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
