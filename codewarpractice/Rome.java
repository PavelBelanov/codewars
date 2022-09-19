package codewarpractice;

import java.sql.SQLOutput;
import java.time.Instant;
import java.util.*;

public class Rome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            try {
                System.out.println(converter(scanner.nextInt()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Всего ХОРОШЕГО!!!");
    }

    public static String converter(int x) throws Exception {
        Long start = Instant.now().toEpochMilli();
        if (x == 0 || x < 0) {
            /*System.out.println("Нет ноля, идите нахуй");*/
            throw new Exception("Нет слов, одни эмоции!!!");
        }

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");


        String result = "";

        Map.Entry<Integer, String> temp;
        while ((temp =  map.floorEntry(x)) != null) {
            result = result.concat(temp.getValue());
            x -= temp.getKey();
        }
        Long end = Instant.now().toEpochMilli();
        System.out.println(end - start);
        return result;
    }

    public static String convert2(int x) {
        Long start = Instant.now().toEpochMilli();
        String[] strArr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numArr = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        if (x <= 0) {
            return "Введите положительное число!";
        }
        String result = "";
        for (int i = 0; i < numArr.length; i++) {
            while (numArr[i] <= x) {
                result += strArr[i];
                x -= numArr[i];
            }
        }
        Long end = Instant.now().toEpochMilli();
        System.out.println(end - start);
        return result;
    }
}



