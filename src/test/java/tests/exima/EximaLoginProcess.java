package tests.exima;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.EPL_PAGE;
import static constants.Constant.Urls.EXIMA_HOMEPAGE;

public class EximaLoginProcess extends BaseTest {

    @Test
    public void signIn() throws InterruptedException {
        basePage.open(EXIMA_HOMEPAGE);
        eximaHomePage
                .clickSignInBtn()
                .selectAccount()
                .clickLogInBtn();
    }
}
