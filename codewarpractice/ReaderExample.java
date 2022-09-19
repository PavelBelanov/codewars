package codewarpractice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReaderExample {
    public static void main(String[] args) {

        try (BufferedReader buff = new BufferedReader(new FileReader("c:/text.txt"))){

            char[] array = buff.readLine().toCharArray();
            for (char c:array){
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
