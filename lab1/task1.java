package java.lab1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("введите длину массива: ");
        int length = input.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Введите элемент массива ");
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }

        double average = sum/length;
        System.out.printf("сумма чисел массива: %d\nсреднее арифметическое: %f",sum,average);

        input.close();
    }
}
