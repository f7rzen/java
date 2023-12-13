package java.lab3;

import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArray = new int[4];

        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(90) + 10;
            randomArray[i] = randomNumber;
        }
        System.out.println(Arrays.toString(randomArray));

        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            if (randomArray[i] < randomArray[i+1]) {
                continue;
            }
            else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("\nМассив является строго возрастающей последовательностью.");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью.");
        }
    }
}
