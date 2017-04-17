package example.java_programming_language.io_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by 이상덕 on 2017-04-17.
 */
public class FindAndWalk {
    public static void main(String[] args) {

        try {
            System.out.println("#java8 find -----------------------------------------------");

            Stream<Path> streamFind = Files.find(Paths.get(".\\src\\main\\java\\example\\java_programming_language"),
                    2,
                    (path, attr) -> String.valueOf(path).endsWith("java"));

            streamFind.map(String::valueOf).forEach(System.out::println);

            System.out.println("#java8 walk -----------------------------------------------");

            Stream<Path> streamWalk = Files.walk(Paths.get(".\\src\\main\\java\\example\\java_programming_language"),
                    3);

            streamWalk.map(String::valueOf).
                    filter(path -> path.endsWith("java")).
                    forEach(System.out::println);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
        }
    }
}
