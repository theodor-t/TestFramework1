package pages.exima_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Accounts.EMAIL_EXIMA;
import static constants.Constant.Accounts.PASSWORD_EXIMA;

public class EximaHomePage extends BasePage {
    public EximaHomePage(WebDriver driver) {
        super(driver);
    }

    private final By signInBtn = By.xpath("//a[@atas='sign-in']");
    private final By emailInput = By.xpath("//input[@atas='sign-in-modal__email']");
    private final By passInput = By.xpath("//input[@atas='sign-in-modal__password']");
    private final By logInBtn = By.xpath("//button[@atas='sign-in-modal__submit']");


    public EximaHomePage clickSignInBtn() throws InterruptedException {
        //Thread.sleep(5000);
        driver.findElement(signInBtn).click();
        Thread.sleep(5000);
        return this;
    }

    public EximaHomePage selectAccount() throws InterruptedException {
        driver.findElement(emailInput).sendKeys(EMAIL_EXIMA);
        driver.findElement(passInput).sendKeys(PASSWORD_EXIMA);
        Thread.sleep(2000);
        return this;
    }

    public EximaHomePage clickLogInBtn() throws InterruptedException {
        driver.findElement(logInBtn).click();
        Thread.sleep(5000);
        return this;
    }
}
