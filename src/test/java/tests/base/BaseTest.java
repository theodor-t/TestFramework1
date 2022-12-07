package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.am_adminpanel.AdminPanel;
import pages.am_callcenter.Leads;
import pages.am_callcenter.TaskTwo;
import pages.am_callcenter.Tasks;
import pages.am_catalogs.*;
import pages.am_loginpage.LoginPage;
import pages.am_system.Users;
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
    protected Sources sources = new Sources(driver);
    protected Regions regions = new Regions(driver);
    protected Professions professions = new Professions(driver);
    protected Offers offers = new Offers(driver);
    protected Locations locations = new Locations(driver);
    protected Languages languages = new Languages(driver);
    protected Employers employers = new Employers(driver);
    protected Employees employees = new Employees(driver);
    protected EmployeePositions employeePositions = new EmployeePositions(driver);
    protected Countries countries = new Countries(driver);
    protected CompanyOffices companyOffices = new CompanyOffices(driver);
    protected Companies companies = new Companies(driver);
    protected CallbackReasons callbackReasons = new CallbackReasons(driver);
    protected Brands brands = new Brands(driver);
    protected Tasks tasks = new Tasks(driver);
    protected TaskTwo taskTwo = new TaskTwo(driver);
    protected Leads leads = new Leads(driver);
    protected Users users = new Users(driver);

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
