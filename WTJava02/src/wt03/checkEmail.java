package wt03;

import java.util.regex.Pattern;

public class checkEmail {
    public static void main(String[] args) {
        System.out.println(check("2304444@qq.com"));
        System.out.println(check("2304444.dd@.qq.com"));
    }

    public static boolean check(String email) {
        if ((email != null) && (!email.isEmpty())) {
            return Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", email);
        }
        return false;
    }
}
