package codewarpractice;
/*
* Возвращает количество (количество) гласных в заданной строке.
* Мы будем рассматривать a, e, i, o, u как гласные для этой Ката (но не y).
* Входная строка будет состоять только из строчных букв и/или пробелов.*/

public class CountGlassEx {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        String [] chars =str.split("");
        for (int i =0; i<chars.length; i++) {
            if(chars[i].equals("a")||chars[i].equals("e")||
                    chars[i].equals("i")||chars[i].equals("o")||
                    chars[i].equals("u"))
                vowelsCount++;
        }
        // your code here
        return vowelsCount;
    }
    public static int getCount1(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
    public static int getCount2(String str) {
        return (int)str.chars()
                .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                .count();
    }
}
