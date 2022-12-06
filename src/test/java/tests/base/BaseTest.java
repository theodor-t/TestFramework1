package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.am_adminpanel.AdminPanel;
import pages.am_loginpage.LoginPage;
import pages.catalogs.SourcesGroups;
import pages.base.BasePage;
import pages.community.CommunityPage;
import pages.epl_home.EplHomePage;
import pages.eplloginpage.EplLoginPage;
import pages.exima_home.EximaHomePage;
import pages.loginpage.EpZoneLoginPage;
import pages.profile.EplProfileHomePage;
import pages.profile.ProfileHomePage;
import pages.epzone_home.EpZoneHomePage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    //EP
    protected EpZoneHomePage epZoneHomePage = new EpZoneHomePage(driver);
    protected CommunityPage communityPage = new CommunityPage(driver);
    protected ProfileHomePage profileHomePage = new ProfileHomePage(driver);
    protected EplHomePage eplHomePage = new EplHomePage(driver);
    protected EpZoneLoginPage epZoneLoginPage = new EpZoneLoginPage(driver);
    protected EplLoginPage eplLoginPage = new EplLoginPage(driver);
    protected EplProfileHomePage eplProfileHomePage = new EplProfileHomePage(driver);
    //EXIMA
    protected EximaHomePage eximaHomePage = new EximaHomePage(driver);
    //AM
    protected LoginPage amLoginPage = new LoginPage(driver);
    protected AdminPanel adminPanel = new AdminPanel(driver);
    protected SourcesGroups sourcesGroups = new SourcesGroups(driver);

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
