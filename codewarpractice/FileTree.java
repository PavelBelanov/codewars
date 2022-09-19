package codewarpractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTree {
    public static void main(String[] args) {
//        try (Stream<Path> pathStream = Files.walk(Paths.get("c:/dir"))){
//            pathStream.filter(Files::isRegularFile)
//                      .forEach(System.out::println);
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        try (DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get("c:/dir"))){
            for(Path file:paths){
                System.out.println(file.toFile().getName());
            }
        }catch (IOException e){

        }
    }
}
