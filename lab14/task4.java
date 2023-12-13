package java.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
            String[] dates = {"29/02/2000", "30/04/2003", "01/01/2003", "29/02/2001", "30-04-2003", "1/1/1899"};

        Pattern pattern = Pattern.compile("^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(19\\d\\d|20\\d\\d)$");

        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                System.out.println(date + " - это правильный формат даты");
            } else {
                System.out.println(date + " - это неправильный формат даты");
            }
        }
    }
}

