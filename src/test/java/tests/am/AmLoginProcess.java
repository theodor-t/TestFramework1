package tests.am;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.AM_LOGINPAGE;


public class AmLoginProcess extends BaseTest {
    @Test
    public void signIn() throws InterruptedException {
        basePage.open(AM_LOGINPAGE);
        amLoginPage.loginAdmin();
    }
}
