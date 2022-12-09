package tests.am.crud.catalogs;

import org.testng.annotations.Test;
import retrytest.Retry;
import tests.base.BaseTest;

import static constants.Constant.Urls.AM_LOGINPAGE;

public class Offers extends BaseTest {

    @Test(retryAnalyzer = Retry.class, priority = 1)
    public void addOffers() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel.
                openMenu().
                openCatalogs().
                openOffers();
        offers.
                clickCreate().
                createOffer();
    }
}
