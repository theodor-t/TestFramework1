package pages.eplloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.epl_home.EplHomePage;

import static constants.Constant.Accounts.EMAIL_EPL_ACCOUNT;
import static constants.Constant.Accounts.PASSWORD_EPL_ACCOUNT;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class EplLoginPage extends BasePage {
    public EplLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailInput = By.xpath("//input[@atas='epl-login__form_email-input']");
    private final By passInput = By.xpath("//input[@atas='epl-login__form_password-input']");
    private final By staySignedCheckbox = By.xpath("//label[@atas='epl-login__form_checkbox']");
    private final By signInBtn = By.xpath("//button[@atas='epl-login__form_submit-btn']");
    private final By clearSessionBtn = By.xpath("//button[@atas='epl-login__form-clear-session-btn']");


    public EplLoginPage selectAccount() throws InterruptedException {
        driver.findElement(emailInput).sendKeys(EMAIL_EPL_ACCOUNT);
        driver.findElement(passInput).sendKeys(PASSWORD_EPL_ACCOUNT);
        Thread.sleep(2000);
        return this;
    }

    public EplLoginPage staySigned() {
        driver.findElement(staySignedCheckbox).click();
        return this;
    }

    public EplLoginPage signInBtn() throws InterruptedException {
        driver.findElement(signInBtn).click();
        Thread.sleep(4000);
        return this;
    }

    public EplLoginPage checkSessionEpl() {
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
