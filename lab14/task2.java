package java.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        String s = "aB1_qwerty";
        Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(\\w){8,}$");
        Matcher m = p.matcher(s);
        System.out.println(m.matches());
    }
}