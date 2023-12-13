package java.lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class task5 {
    public static class Factorial {

        public static BigInteger calculate_factorial(int numbers) {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= numbers; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Введите число ");
            int x = input.nextInt();
            if (x < 0) {
                System.out.print("Число не может быть отрицательным");
                return;
            }
            System.out.print(Factorial.calculate_factorial(x));
            input.close();
        }
    }
}