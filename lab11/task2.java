package java.lab11;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (в формате dd.MM.yyyy HH:mm:ss): ");
        String inputDate = scanner.nextLine();
        scanner.close();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date1 = new Date();
        Date date2 = null;
        try {
            date2 = dateFormat.parse(inputDate);
            System.out.println("Введенная дата: " + dateFormat.format(date2));
            System.out.println("Текущя дата: " + dateFormat.format((date1)));
        } catch (ParseException e) {
            System.out.println("Ошибка! Неверный формат даты.");
            e.printStackTrace();
        }

        long time1 = date1.getTime();
        long time2 = date2.getTime();

        if (time1 > time2) {
            System.out.println("date1 позже, чем date2");
        } else if (time1 < time2) {
            System.out.println("date1 раньше, чем date2");
        } else {
            System.out.println("date1 и date2 совпадают");
        }
    }
}



