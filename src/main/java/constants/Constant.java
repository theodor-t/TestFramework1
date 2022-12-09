package constants;

public class Constant {
    public static class TimeoutVariable {
        //Set timeout
        public static final int IMPLICIT_WAIT = 15;
        public static final int EXPLICIT_WAIT = 10;
        public static final int SLEEP = 10;
    }

    public static class Urls {
        public static final String HOME_PAGE = "https://www.ep-zone.net/";
        public static final String COMMUNITY_PAGE = "https://community.ep-zone.net/";
        public static final String LOGIN_PAGE = "https://www.ep-zone.net/login";
        public static final String EPL_PAGE = "https://epl.ep-zone.net/";
        public static final String EXIMA_HOMEPAGE = "https://exima.usalinksystem.net/";
        public static final String AM_LOGINPAGE = "https://am-dev.powerit.dev/en/auth/login";
    }

    public static class Accounts {
        //Agentia Muncii Admin
        public static final String EMAIL_ADMIN = "tudor@powerit.dev";
        public static final String PASSWORD_ADMIN = "Pa$$w0rd!";
        //Single account
        public static final String EMAIL_SINGLEACC = "buyer98@mailinator.com";
        public static final String PASSWORD_SINGLEACC = "Tester123";
        //Multi account
        public static final String EMAIL_MULTIACC = "full@uls.com";
        public static final String PASSWORD_MULTIACC = "Pa$$w0rd!";
        //EPL Account
        public static final String EMAIL_EPL_ACCOUNT = "shipper@uls.com";
        public static final String PASSWORD_EPL_ACCOUNT = "Pa$$w0rd!";
        //EXIMA Account
        public static final String EMAIL_EXIMA = "importer100@mailinator.com";
        public static final String PASSWORD_EXIMA = "Test123!";
    }
}
