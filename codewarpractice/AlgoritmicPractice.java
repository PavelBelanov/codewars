package codewarpractice;

public class AlgoritmicPractice {
    public static void main(String[] args) {


        Integer[] integers = new Integer[100];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
             System.out.print(integers[i] + ",");
        }
        System.out.println();
        System.out.println(search(integers, 35));

    }

    public static int search(Integer[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        int mid =0;

        while (low <= high) {
            mid = (low + high) / 2;
            int midValue = arr[mid];
            if(midValue==item) return mid;
            if (midValue < item) low = mid + 1;
            else high = mid - 1;

        }
        return mid;
    }
}
