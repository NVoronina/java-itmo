package homework1;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println(IsOdd.inOutOdd(b));
    }

    private static String inOutOdd(int b) {
        if (b % 2 == 0) {
            if (b > 100) {
                return "Выход за пределы диапазона";
            }
            return "Четное";
        }
        return "Нечетное";
    }
}
