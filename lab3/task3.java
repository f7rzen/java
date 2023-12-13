package java.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (true) {
            if (n > 0) {
                break;
            } else {
                System.out.println("Число должно быть больше 0.");
                return;
            }
        }

        int[] randomArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int randomValue = random.nextInt(n);
            randomArray[i] = randomValue;
        }
        System.out.println(Arrays.toString(randomArray));

        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (randomArray[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println(evenCount);

        int[] Array = new int[evenCount];
        if (evenCount >= 0) {
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (randomArray[i] % 2 ==0) {
                    Array[j] = randomArray[i];
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(Array));
    }
}
