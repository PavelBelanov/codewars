package codewarpractice;

import java.util.Arrays;
import java.util.Collections;

public class ReversMass {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(579102)));
    }

    public static int[] digitize(long n) {
        String str = Long.toString(n);
        String[] strings = str.split("");
        int[] result = new int[strings.length];
        for (int i = result.length-1; i >=0; i--){
            result[i] = Integer.parseInt(strings[i]);
        }
        int a = result.length;
        for (int i = 0; i < result.length/2; i++) {
            int temp = result[a-i-1];
            result[a-i-1] = result[i];
            result[i] = temp;
        }
        return result;
    }


    public static int[] streamDigitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }



    public static int[] versionDigitize(long n) {
        String[] nums = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}
