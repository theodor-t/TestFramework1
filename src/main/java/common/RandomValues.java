package common;

import java.security.SecureRandom;

public class RandomValues {
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom random = new SecureRandom();
    static final int RND_LENGTH = 5;

    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(random.nextInt(AB.length())));
        return sb.toString();
    }

    public static String appendRandomString(String str) {

        return str + RandomValues.randomString(RND_LENGTH);

    }
}
