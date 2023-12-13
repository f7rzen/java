package java.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class task1 {
    public static void main(String[] args) {
        String Surname = "Kudinov Artem";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Calendar calendar = new GregorianCalendar(2023,9,20,10,23,23);
        System.out.println("Фамилия разработчика: " + Surname);
        System.out.println("Дата и время получения задания: " + sdf.format(calendar.getTime()));
        System.out.println("Дата и время сдачи задания: " + sdf.format(date));

    }
}
