package codewarpractice;
import java.util.Arrays;

public class SortArrayEx {
    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length ; j++) {
                if(array[i]%2!=0 && array[j]%2!=0&&array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }
}
