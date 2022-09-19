package codewarpractice;

import java.util.Arrays;

public class MassSqrtEx {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2};
        System.out.println(squareSum(arr));

    }

    public static int squareSum(int[] n) {
        int [] arr2 = new int[n.length];
        int x = 0;
        for (int i = 0; i < n.length; i++) {
            arr2[i] = n[i]*n[i];
            x += arr2[i];
        }
        return x;
    }
    public static int squareSum2(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n * n;
        }

        return sum;
    }
    public static int squareSum3(int[] xs) {
        return Arrays.stream(xs).map(x -> x * x).sum();
    }

}
