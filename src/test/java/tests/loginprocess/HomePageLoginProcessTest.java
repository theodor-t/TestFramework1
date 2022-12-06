package tests.loginprocess;

import org.testng.annotations.Test;
import retrytest.Retry;
import tests.base.BaseTest;

import static constants.Constant.Urls.HOME_PAGE;

public class HomePageLoginProcessTest extends BaseTest {


    @Test(retryAnalyzer = Retry.class)
    public void loginSingleAccount() throws InterruptedException {
        basePage.open(HOME_PAGE);
        epZoneHomePage
                .logInHomePage()
                .selectSingleAccount()
                .staySigned()
                .clickLoginHomePage();

        if (epZoneHomePage.hasClearSessionButton()) {
            epZoneHomePage
                    .checkSession()
                    .selectSingleAccount()
                    .clickLoginHomePage();
        }

        profileHomePage
                .checkAuthorization()
                .logout();

    }

    @Test(retryAnalyzer = Retry.class)
    public void loginWithBuyer() throws InterruptedException {
        basePage.open(HOME_PAGE);
        epZoneHomePage
                .logInHomePage()
                .selectMultiAccount()
                .clickLoginHomePage()
                .buyerAccount();


        if (epZoneHomePage.hasClearSessionButton()) {
            epZoneHomePage
                    .checkSession()
                    .selectMultiAccount()
                    .clickLoginHomePage()
                    .buyerAccount();
        }

        profileHomePage
                .checkAuthorization()
                .logout();

    }

    @Test(retryAnalyzer = Retry.class)
    public void loginWithSeller() throws InterruptedException {
        basePage.open(HOME_PAGE);
        epZoneHomePage
                .logInHomePage()
                .selectMultiAccount()
                .clickLoginHomePage()
                .sellerAccount();

        if (epZoneHomePage.hasClearSessionButton()) {
            epZoneHomePage
                    .checkSession()
                    .selectMultiAccount()
                    .clickLoginHomePage()
                    .sellerAccount();
        }

        profileHomePage
                .checkAuthorization()
                .logout();

    }

    @Test(retryAnalyzer = Retry.class)
    public void loginWithManufacturer() throws InterruptedException {
        basePage.open(HOME_PAGE);
        epZoneHomePage
                .logInHomePage()
                .selectMultiAccount()
                .clickLoginHomePage()
                .manufacturerAccount();

        if (epZoneHomePage.hasClearSessionButton()) {
            epZoneHomePage
                    .checkSession()
                    .selectMultiAccount()
                    .clickLoginHomePage()
                    .manufacturerAccount();
        }

        profileHomePage
                .checkAuthorization()
                .logout();

    }

    @Test
    public void loginWithShipper() throws InterruptedException {
        basePage.open(HOME_PAGE);
        epZoneHomePage
                .logInHomePage()
                .selectShipperAccount()
                .staySigned()
                .clickLoginHomePage()
                .goToEpl();
        eplLoginPage
                .selectAccount()
                .signInBtn();
        if (eplLoginPage.hasClearSessionButton()) {
            eplLoginPage
                    .checkSessionEpl()
                    .signInBtn();
        }
        eplProfileHomePage
                .checkAuthorization()
                .logout();
    }

}
