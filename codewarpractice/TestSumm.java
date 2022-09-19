package codewarpractice;

import java.util.Arrays;

public class TestSumm {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 7, 8, 10};
        System.out.println(Arrays.toString(summator(array)));
    }

    static int[] summator(int[] arrays) {
        int[] ressult = new int[arrays.length];

        for (int i = 0; i < ressult.length; i++) {
            int x = arrays[i];
            for (int j = 0; j < arrays.length; j++) {
              x*=arrays[j];
            }
                ressult[i] = x;
        }

        return ressult;
    }
}
