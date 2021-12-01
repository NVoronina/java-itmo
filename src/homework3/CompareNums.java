package homework3;

import java.util.Scanner;

/**
 * 4.	Напишите программу, которая принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа. Пример вывода:
 *
 * Введите первое число: 5
 * Введите второе число: 10
 * Введите третье число: 15
 * Результат: true
 */
public class CompareNums {
    private Scanner scanner;
    private int[] dataSet = new int[3];

    public static void main(String[] args) {
        CompareNums sum = new CompareNums();
    }
    public CompareNums() {
        this.scanner = new Scanner(System.in);
        this.listener();
    }

    private void listener() {
        boolean result = false;
        System.out.println("Введите первое число: ");
        this.dataSet[0] = this.scanner.nextInt();
        System.out.println("Введите второе число: ");
        this.dataSet[1] = this.scanner.nextInt();
        System.out.println("Введите третье число: ");
        this.dataSet[2] = this.scanner.nextInt();
        if (this.dataSet[2] > this.dataSet[1] && this.dataSet[1] > this.dataSet[0]) {
            result = true;
        }
        System.out.println("Результат: " + result);
    }
}
