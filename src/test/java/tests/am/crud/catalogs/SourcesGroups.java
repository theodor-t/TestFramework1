package tests.am.crud.catalogs;

import org.testng.annotations.Test;
import retrytest.Retry;
import tests.base.BaseTest;

import static constants.Constant.Urls.AM_LOGINPAGE;

public class SourcesGroups extends BaseTest {

    @Test(retryAnalyzer = Retry.class, priority = 1)
    public void addSourcesGroups() throws InterruptedException {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel.
                openMenu().
                openCatalogs().
                openSourcesGroups();
        sourcesGroups.
                clickCreate().
                createSourceGroup();
    }

    @Test(retryAnalyzer = Retry.class, priority = 1)
    public void editSourcesGroups() throws InterruptedException {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel.
                openMenu().
                openCatalogs().
                openSourcesGroups();
        sourcesGroups.
                editSourceGroup();
    }

    @Test(retryAnalyzer = Retry.class, priority = 2)
    public void deleteSourcesGroups() throws InterruptedException {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel.
                openMenu().
                openCatalogs().
                openSourcesGroups();
        sourcesGroups.
                deleteSourceGroup();
    }
}
