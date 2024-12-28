package pages.md999.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Accounts.EMAIL_ADMIN;
import static constants.Constant.Accounts.PASSWORD_ADMIN;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    private static final By emailInput = By.xpath("//input[@name='login']");
    private static final By passwordInput = By.xpath("//input[@name='password']");
    private static final By loginButton = By.xpath("//button[@type='submit']");


    public LoginPage loginInSystem() {
        driver.findElement(emailInput).sendKeys(EMAIL_ADMIN);
        driver.findElement(passwordInput).sendKeys(PASSWORD_ADMIN);
        driver.findElement(loginButton).click();
        return this;
    }
}
