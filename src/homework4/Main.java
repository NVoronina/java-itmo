package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isSorted(new int[]{3,4,34,55});
        isSorted(new int[]{3,2,34,4});
        changeArray(new int[]{3,2,34,4});
        System.out.println(findUnique(new int[]{1, 2, 3, 1, 2, 4}));
        mergeSortRandom(8);
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

    /**
     * 3.	Напишите метод, который меняет местами первый и последний элемент массива. Пример вывода:
     *
     * Array 1: [5, 6, 7, 2]
     * Array 2: [2, 6, 7, 5]
     */
    private static void changeArray(int[] array) {
        System.out.println("Array 1:" + Arrays.toString(array));
        int tmp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = tmp;
        System.out.println("Array 2:" + Arrays.toString(array));
    }

    /**
     * 4.	Дан массив чисел. Найдите первое уникальное в этом массиве число.
     * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
     * @param array
     */
    private static int findUnique(int[] array) {
        int[] sorted = lesson4.Main.bubbleSortedArray(array);
        int tmp = sorted[0];
        for (int i = 0; i < sorted.length; i++) {
            if (tmp == sorted[i]) {
                continue;
            }
            if (sorted[i] == sorted[i + 1]) {
                tmp = sorted[i];
            } else {
                return sorted[i];
            }
        }
        return -1;
    }

    /**
     * 5.	Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.
     */
    private static void mergeSortRandom(int arrayLength) {
        int[] array = new int[arrayLength];
        Random rand = new Random();
        for (int i = 0; i < arrayLength; i++ ) {
            array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(lesson4.Main.mergeSort(array)));
    }
}
