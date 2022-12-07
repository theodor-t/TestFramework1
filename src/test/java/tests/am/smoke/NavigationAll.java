package tests.am.smoke;

import org.testng.annotations.Test;
import retrytest.Retry;
import tests.base.BaseTest;

import static constants.Constant.Urls.AM_LOGINPAGE;

public class NavigationAll extends BaseTest {
    //////CATALOGS
    @Test(retryAnalyzer = Retry.class)
    public void checkSourcesGroupsPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openSourcesGroups();
        sourcesGroups
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkSourcesPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openSources();
        sources
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkCountriesPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openCountries();
        countries
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkRegionsPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openRegions();
        regions
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkLocationsPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openLocations();
        locations
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkEmployeesPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openEmployees();
        employees
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkEmployersPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openEmployers();
        employers
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkEmployeePositionsPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openEmployeePositions();
        employeePositions
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkCompaniesPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openCompanies();
        companies
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkCompanyOfficesPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openCompanyOffices();
        companyOffices
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkOffersPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openOffers();
        offers
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkBrandsPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openBrands();
        brands
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkProfessionsPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openProfessions();
        professions
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkLanguagesPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openLanguages();
        languages
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkCallBackReasonsPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCatalogs()
                .openCallBackReasons();
        callbackReasons
                .checkIfExistElements();
    }

    //////CALL CENTER
    @Test(retryAnalyzer = Retry.class)
    public void checkTasksPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCallCenter()
                .openTasks();
        tasks
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkTaskTwoPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCallCenter()
                .openTaskTwo();
        taskTwo
                .checkIfExistElements();
    }

    @Test(retryAnalyzer = Retry.class)
    public void checkLeadsPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openCallCenter()
                .openLeads();
        leads
                .checkIfExistElements();
    }

    //////SYSTEM
    @Test(retryAnalyzer = Retry.class)
    public void checkUsersPage() {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
        adminPanel
                .openMenu()
                .openSystem()
                .openUsers();
        users
                .checkIfExistElements();
    }

}
