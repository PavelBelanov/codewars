package Algoritmic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestAlgoritm {
    public static void main(String[] args) {
        Integer[] array = new Integer[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200);
            System.out.print(array[i] + ",");
        }
        System.out.println("\n");
        //int [] arr = Arrays.stream(array).sorted().toArray();

        //System.out.println(Arrays.toString(arr));
        List<Integer> list = Arrays.stream(array)
                .sorted((s1,s2)->s2-s1)
                .collect(Collectors.toList());

        /* System.out.println(list); */
        list.forEach(x-> System.out.print(x + ", "));



 //       System.out.println("\n");
  //      System.out.println(MyChoiseSort.searchMin(array));
  //      System.out.println(MyChoiseSort.searchMax(array));

 //       MyChoiseSort.hairbrushSort(array);

   //     System.out.println(Arrays.toString(array));
    }
}
