package codewarpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Vopros {
    static class MyComparator implements Comparator<String> {
        public int compare(String strA, String strB) {
            return strB.compareTo(strA);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> listik = new ArrayList<>();
        Collections.addAll(listik,"hello", "world", "any_shit", "my_word");
        String[] mass = new String[]{"hello", "world", "any_shit", "my_word"};
        MyComparator rsc = new MyComparator();
        Collections.sort(listik, rsc);
        System.out.println(Integer.toHexString(123));
    }
}
