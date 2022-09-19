package Algoritmic;

import java.util.Arrays;

public class MyChoiseSort {

    public static String searchMin(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return "Минимальное число " + min + " под индексом " + index;
    }

    public static String searchMax(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return "Максимальное число " + max + " под индексом " + index;
    }


    public static void selectionSort(int[] array) {
        int min;
        int temp;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static void bubblesSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void hairbrushSort(int[] array) {
        int interval = array.length;
        boolean isSorted = false;

        while (!isSorted || interval != 1) {
            if (interval > 1) {
                interval = interval * 10 / 13;
            } else {
                interval = 1;
            }
            isSorted = true;
            for (int i = interval; i < array.length; i++) {
                if (array[i - interval] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - interval];
                    array[i - interval] = temp;
                    isSorted = false;
                }
            }
        }
    }
}

