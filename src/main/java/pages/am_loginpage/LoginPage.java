package pages.am_loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Accounts.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By usernameInput = By.xpath("//input[@name='identifier']");
    private final By passwordInput = By.xpath("//input[@name='password']");
    private final By loginBtn = By.xpath("//button[@type='submit']");

    public LoginPage loginAdmin() throws InterruptedException {
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(EMAIL_ADMIN);
        driver.findElement(passwordInput).sendKeys(Keys.SHIFT, Keys.ARROW_UP);
        driver.findElement(passwordInput).sendKeys(Keys.DELETE);
        driver.findElement(passwordInput).sendKeys(PASSWORD_ADMIN);
        driver.findElement(loginBtn).click();
        return this;
    }

}
