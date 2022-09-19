package codewarpractice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOExample {
    public static void main(String[] args) throws IOException {
        // Path path = Path.of("c:\\text");
        try (InputStream input = new FileInputStream("c:\\text.txt");
             OutputStream output = new FileOutputStream("c:\\copytext.txt")) {
            byte[] arr = input.readAllBytes();
            //byte[] arr2 = arr;
            output.write(arr);
            for (byte b : arr) {
                System.out.print((char) b);
            }
        }


    }

    public static void reader(InputStream in) throws IOException {

        int oneByte;
        while ((oneByte = in.read()) != -1)
            System.out.print((char) oneByte);
    }
}
