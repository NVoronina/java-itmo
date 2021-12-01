package lesson3;

import java.util.Arrays;

public class ArrayMy {

    public static void main(String[] args) {
        int[] arrayMy = new int[10];
        int[][] arrayWow = new int[2][5];
        for (int[] ints : arrayWow) {
            System.out.println(Arrays.toString(ints));
        }

        try {
            arrayMy[0] = 1;
            arrayMy[9] = 2;
            arrayMy[4] = 3;
            arrayMy[2] = 66;
            arrayMy[10] = 66;
            System.out.println(Arrays.toString(arrayMy));
        } catch (Throwable throwable) {
            System.out.println("test");
            Arrays.sort(arrayMy);
            System.out.println(Arrays.toString(arrayMy));
            System.out.println(Arrays.binarySearch(arrayMy, 0));
        }
    }
}
