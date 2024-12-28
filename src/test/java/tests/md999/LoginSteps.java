package tests.md999;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.md999.loginpage.LoginPage;
import tests.base.BaseTest;

import static constants.Constant.Urls.MD999_LOGINPAGE;

public class LoginSteps extends BaseTest {

    @Given("I open the login page")
    public void iOpenTheLoginPage() {
        basePage.open(MD999_LOGINPAGE);
    }


    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginInSystem();
    }

    @Then("I should be redirected to the admin dashboard")
    public void iShouldBeRedirectedToTheAdminDashboard() {
        System.out.println("Redirected to admin dashboard");
    }
}
