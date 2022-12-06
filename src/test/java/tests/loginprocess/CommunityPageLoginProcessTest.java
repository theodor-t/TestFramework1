package tests.loginprocess;

import org.testng.annotations.Test;
import retrytest.Retry;
import tests.base.BaseTest;

import static constants.Constant.Urls.COMMUNITY_PAGE;

public class CommunityPageLoginProcessTest extends BaseTest {
    @Test(retryAnalyzer = Retry.class)
    public void loginSingleAccount() throws InterruptedException {
        basePage.open(COMMUNITY_PAGE);
        communityPage
                .logInCommunityPage();
        epZoneHomePage
                .selectSingleAccount()
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
        basePage.open(COMMUNITY_PAGE);
        communityPage
                .logInCommunityPage();
        epZoneHomePage
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
        basePage.open(COMMUNITY_PAGE);
        communityPage
                .logInCommunityPage();
        epZoneHomePage
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
        basePage.open(COMMUNITY_PAGE);
        communityPage
                .logInCommunityPage();
        epZoneHomePage
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

}
