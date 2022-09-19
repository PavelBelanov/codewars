package codewarpractice;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWords {
    public static void main(String[] args) {
        String str = "eating like I";
        System.out.println(reverseWords(str));
        System.out.println(reverse2(str));
        }



    public static String reverseWords(String str){
        String[] pre = str.split(" ");
        List<String> one = Arrays.asList(pre);
        Collections.reverse(one);
        String str2="";
        for(String s: one){
            str2=str2+s+" ";
        }
       str2 = str2.trim();
        return str2;
    }
    public static String reverse2(String str){
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    }

