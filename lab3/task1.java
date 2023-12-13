package java.lab3;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int length = 3;
        double[] randomArrayMath = new double[length];
        double[] randomArrayRandom = new double[length];


        for (int i = 0; i < length; i++) {
            double randomValue = Math.random();
            randomArrayMath[i] = randomValue;
        }

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            double randomValue = random.nextDouble();
            randomArrayRandom[i] = randomValue;
        }

        System.out.println("Массив, созданный с использованием Math.random():");
        System.out.println(Arrays.toString(randomArrayMath));
        System.out.println("\nМассив, созданный с использованием класса Random:");
        System.out.println(Arrays.toString(randomArrayRandom));

        Arrays.sort(randomArrayMath);
        Arrays.sort(randomArrayRandom);

        System.out.println("\nОтсортированный массив, созданный с использованием Math.random():");
        System.out.println(Arrays.toString(randomArrayMath));
        System.out.println("\nОтсортированный массив, созданный с использованием класса Random:");
        System.out.println(Arrays.toString(randomArrayRandom));
    }
}
