package homework3;

import java.util.Scanner;

/**
 * 3.	Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу. Пример вывода:
 *
 * Введите первое число: 5
 * Введите второе число: 10
 * Введите третье число: 15
 * Результат: true
 */
public class CheckSum {
    private Scanner scanner;
    private int firstNum;
    private int secondNum;
    private int resultAssemption;

    public static void main(String[] args) {
        CheckSum sum = new CheckSum();
    }

    public CheckSum() {
        this.scanner = new Scanner(System.in);
        this.listener();
    }

    private void listener() {
        boolean result = false;
        System.out.println("Введите первое число: ");
        this.firstNum = this.scanner.nextInt();
        System.out.println("Введите второе число: ");
        this.secondNum = this.scanner.nextInt();
        System.out.println("Введите третье число: ");
        this.resultAssemption = this.scanner.nextInt();
        if ((this.firstNum + this.secondNum) == this.resultAssemption) {
            result = true;
        }
        System.out.println("Результат: " + result);
    }
}
