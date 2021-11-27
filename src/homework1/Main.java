package homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Я\nхорошо\nзнаю\nJava.");
        System.out.println((46 + 10) + (10 / 3));
        System.out.println(29 * 4 * -25);

        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);
        System.out.println(Main.calculate(3.6, 4.1, 5.9));
    }

    private static double calculate(double a, double b, double c) {
        double result = a * b * c;

        return result;
    }

}
