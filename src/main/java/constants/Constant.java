package constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
        public static final String MD999_LOGINPAGE = "https://simpalsid.com/user/login";
    }

    public static class Accounts {
        private static final Properties properties = new Properties();

        static {
            try {
                FileInputStream fis = new FileInputStream("src/main/resources/credentials.properties");
                properties.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load credentials.properties file");
            }
        }

        public static final String EMAIL_ADMIN = properties.getProperty("EMAIL_ADMIN");
        public static final String PASSWORD_ADMIN = properties.getProperty("PASSWORD_ADMIN");
        public static final String EMAIL_SINGLEACC = properties.getProperty("EMAIL_SINGLEACC");
        public static final String PASSWORD_SINGLEACC = properties.getProperty("PASSWORD_SINGLEACC");
        public static final String EMAIL_MULTIACC = properties.getProperty("EMAIL_MULTIACC");
        public static final String PASSWORD_MULTIACC = properties.getProperty("PASSWORD_MULTIACC");
        public static final String EMAIL_EPL_ACCOUNT = properties.getProperty("EMAIL_EPL_ACCOUNT");
        public static final String PASSWORD_EPL_ACCOUNT = properties.getProperty("PASSWORD_EPL_ACCOUNT");
        public static final String EMAIL_EXIMA = properties.getProperty("EMAIL_EXIMA");
        public static final String PASSWORD_EXIMA = properties.getProperty("PASSWORD_EXIMA");
    }
}
