package tests.loginprocess;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.EPL_PAGE;

public class EplPageLoginProcessTest extends BaseTest {

    @Test
    public void loginEplAccount() throws InterruptedException {
        basePage.open(EPL_PAGE);
        eplHomePage
                .loginEplHomePage()
                .selectAccount()
                .staySigned()
                .signInBtn();
        if (eplHomePage.hasClearSessionButton()) {
            eplHomePage
                    .checkSessionEpl()
                    .signInBtn();
        }
        eplProfileHomePage
                .checkAuthorization()
                .logout();
    }

    @Test
    public void loginEpZoneAccount() throws InterruptedException {
        basePage.open(EPL_PAGE);
        eplHomePage
                .loginEplHomePage()
                .selectEpZoneAccount()
                .staySigned()
                .signInBtn()
                .goToEp();
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
}
