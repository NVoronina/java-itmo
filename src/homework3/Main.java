package homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        numsOdd(100);
        findNums(100);
        int[] array = new int[]{23, 33, 22, 3};
        int[] needle = new int[]{1, 3};
        System.out.println(inArray(needle, array));
    }

    /**
     * 1.	Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печается с новой стороки.
     * @param max
     */
    private static void numsOdd(int max) {
        for (int i = 0; i < max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 2.	Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5). Пример вывода:
     *
     *  Делится на 3: ….
     * 	Делится на 5: ….
     *  Делится на 3 и на 5: ….
     *
     * @param max
     */
    private static void findNums(int max) {
        for (int i = 0; i < max; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("Делится на 3 и на 5: " + i);
                } else {
                    System.out.println("Делится на 3: " + i);
                }
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }

    /**
     * 5.	Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел. Длина массива должна быть больше или равна двум. Пример вывода:
     * array = 3, -3, 7, 4, 5, 4, 3
     * true
     */
    private static void checkArray(int[] array) {
        if (array.length < 2) {
            System.out.println("Not valid argument");
        }
        boolean result = false;
        if (array[0] == 3 || array[array.length - 1] == 3) {
            result = true;
        }
        System.out.println("array = " + Arrays.toString(array));
        System.out.println(result);
    }

    /**
     * 6.	Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
     * @param needle
     * @param array
     * @return
     */
    private static boolean inArray(int[] needle, int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < needle.length; j++) {
                if (needle[j] == array[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
