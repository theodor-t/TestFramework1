package tests.loginprocess;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.HOME_PAGE;
import static constants.Constant.Urls.LOGIN_PAGE;

public class LoginPageProcessTest extends BaseTest {

    @Test
    public void loginSingleAccount() throws InterruptedException {
        basePage.open(LOGIN_PAGE);
        epZoneLoginPage
                .selectSingleAccount()
                .staySigned()
                .clickLogin();

        if (epZoneHomePage.hasClearSessionButton()) {
            epZoneHomePage
                    .checkSession();
            epZoneLoginPage
                    .selectSingleAccount()
                    .clickLogin();
        }
        profileHomePage
                .checkAuthorization()
                .logout();

    }

    @Test
    public void loginWithBuyer() throws InterruptedException {
        basePage.open(LOGIN_PAGE);
        epZoneLoginPage
                .selectMultiAccount()
                .staySigned()
                .clickLogin()
                .buyerAccount();

        if (epZoneHomePage.hasClearSessionButton()) {
            epZoneHomePage
                    .checkSession();
            epZoneLoginPage
                    .selectMultiAccount()
                    .clickLogin()
                    .buyerAccount();
        }
        profileHomePage
                .checkAuthorization()
                .logout();

    }

    @Test
    public void loginWithSeller() throws InterruptedException {
        basePage.open(LOGIN_PAGE);
        epZoneLoginPage
                .selectMultiAccount()
                .staySigned()
                .clickLogin()
                .sellerAccount();

        if (epZoneHomePage.hasClearSessionButton()) {
            epZoneHomePage
                    .checkSession();
            epZoneLoginPage
                    .selectMultiAccount()
                    .clickLogin()
                    .sellerAccount();
        }
        profileHomePage
                .checkAuthorization()
                .logout();
    }

    @Test
    public void loginWithManufacturer() throws InterruptedException {
        basePage.open(LOGIN_PAGE);
        epZoneLoginPage
                .selectMultiAccount()
                .staySigned()
                .clickLogin()
                .manufacturerAccount();

        if (epZoneHomePage.hasClearSessionButton()) {
            epZoneHomePage
                    .checkSession();
            epZoneLoginPage
                    .selectMultiAccount()
                    .clickLogin()
                    .manufacturerAccount();
        }
        profileHomePage
                .checkAuthorization()
                .logout();

    }

}
