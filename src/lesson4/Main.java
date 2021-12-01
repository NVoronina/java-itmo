package lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{44, 55, 453, 4, 0};
        int[] array2 = new int[]{33, 234, 3, 4, 2};
        System.out.println(Arrays.toString(bubbleSortedArray(array)));
        System.out.println(Arrays.toString(mergeSort(array2)));
    }
    public static int[] bubbleSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int aj = array[j];
                    int ai = array[i];
                    array[i] = aj;
                    array[j] = ai;
                }
            }
        }
        return array;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < mid; j++) {
            right[j] = array[mid + j];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                 }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
