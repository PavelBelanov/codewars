package codewarpractice;

import static java.util.Arrays.stream;

/*Дан список целых чисел, определить, является ли сумма его элементов четной или нечетной.
 Дайте ответ в виде строки, соответствующей «нечетному» или «четному».
  Если входной массив пуст, рассматривайте его как: [0] (массив с нулем).
 */
public class SumMass {
    public static void main(String[] args) {
        int [] array = new int[]{};
        System.out.println(oddOrEven(array));
    }
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        if(sum%2==0) return "even";
        else return "odd";
        // your code
    }
    static String oddOrEven2(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
