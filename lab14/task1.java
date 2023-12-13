package java.lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class task1 {
    public static void main(String[] args) {
        String s = "example@mail.ru";
        Pattern p = Pattern.compile("\\w{3,}@\\w+.\\w{2,3}");
        Matcher m = p.matcher(s);
        System.out.println(m.matches());
    }
}
