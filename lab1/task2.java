package java.lab1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("введите длину массива: ");
        int length = input.nextInt();

        int[] arr = new int[length];

        int i = 0;
        do {
            System.out.print("Введите элемент массива ");
            arr[i] = input.nextInt();
            i++;
        } while (i < length);

        int j = 0;
        int sum = 0;
        do {
            sum += arr[j];
            j++;
        } while (j < length);

        int max = arr[0];
        int min = arr[0];
        int k = 0;
        int p = 0;

        while (k < length){
            if (arr[k] > max) {
                max = arr[k];
            }
            k++;
        }
        while (p < length){
            if (arr[p] < min) {
                min = arr[p];
            }
            p++;
        }

        System.out.printf("сумма чисел массива: %d\nмаксимальное число: %d\nминимальное число: %d",sum,max,min);
        input.close();
    }
}
