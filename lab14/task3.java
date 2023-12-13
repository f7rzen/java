package java.lab14;
import java.util.regex.Pattern;
public class task3 {
    public static void main(String[] args) {
        String text = "Егор Алла Анна";
        Pattern pattern = Pattern.compile("\\s");
        String[] strings = pattern.split(text);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}