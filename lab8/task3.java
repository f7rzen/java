package java.lab8;

import java.util.Scanner;

public class task3 {
    public static void printNumbers(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            printNumbers(a + 1, b);
        } else {
            System.out.println(); // Переход на новую строку после завершения вывода чисел.
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();

        System.out.print("Введите число B: ");
        int b = scanner.nextInt();

        System.out.println("Числа от " + a + " до " + b + ":");

        // Вызываем функцию для вывода чисел от A до B включительно.
        printNumbers(a, b);

        scanner.close();
    }
}
