package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isSorted(new int[]{3,4,34,55});
        isSorted(new int[]{3,2,34,4});
        arrayLog();
    }

    /**
     * 1.	Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
     * Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
     * @param array
     * @return
     */
    private static void isSorted(int[] array) {
        boolean checker = true;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) < array.length && array[i] > array[i + 1]) {
                checker = false;
                break;
            }
        }
        System.out.println(checker ? "OK" : "Please, try again");
    }

    /**
     * 2.	Напишите программу, которая считывает с клавиатуры длину массива
     * (например, пользователь вводит цифру 4), затем пользователь вводит 4
     * числа и на новой строке выводится массив из 4 элементов. Пример вывода:
     *
     *    Array length: 4
     *    Numbers of array:
     *    5
     *    6
     *    7
     *    2
     *    Result: [5, 6, 7, 2]
     * @return
     */
    private static void arrayLog() {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        System.out.println("Array length: " + max);
        System.out.println("Numbers of array:");
        int[] array = new int[max];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
