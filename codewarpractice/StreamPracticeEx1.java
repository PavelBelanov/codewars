package codewarpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPracticeEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("HI");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Pavel");

        System.out.println(list);
        String [] arr = list.toArray(new String[0]);
        Arrays.stream(arr).forEach(s -> System.out.print(s+" "));


        List<Integer> list2 = list.stream()
                .map(i -> i.length())
                .filter(e-> e!=2)
                .collect(Collectors.toList());

        System.out.println(list2);
    }


}
