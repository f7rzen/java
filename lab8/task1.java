package java.lab8;

public class task1 {
    public static String recursion(int n) { //3
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i; //3 // 3
                j = i; //2 // 2
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(recursion(--n) + " " + j);
        }
        return "";
    }
    public static void main(String[] args) {
        recursion(3); // вызов рекурсивной функции
    }
}
