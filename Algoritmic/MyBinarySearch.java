package Algoritmic;

public class MyBinarySearch {

    public static String search(Integer[] arr, int item) {
        int low = 0;
        int hi = arr.length - 1;
        int mid;
        int count = 0;
        while (low <= hi) {

            mid = (low + hi) / 2;
            int value = arr[mid];
            if (value == item) return "Элемент " + item + " под индексом " + mid + " Колличество итераций = " + count;
            else if (value > item) hi = mid - 1;
            else low = mid+1;
            count++;
        }
        return "Элемент не найден. Колличество итераций =  " + count;
    }
}
