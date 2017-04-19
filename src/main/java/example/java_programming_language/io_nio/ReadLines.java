package example.java_programming_language.io_nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by 이상덕 on 2017-04-17.
 */
public class ReadLines {
    public static void main(String[] args) {
        BufferedReader oldjavaBr = null;

        try {
            System.out.println("old java BufferedReader --------------------------------------------");
            oldjavaBr = new BufferedReader(new FileReader(".\\src\\main\\java\\example\\java_programming_language\\io_nio\\ReadLines.java"));
            String line;
            while ((line = oldjavaBr.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("java8 Read lines -------------------------------------------------");
            Stream<String> streamLines = Files.lines(Paths.get(".\\src\\main\\java\\example\\java_programming_language\\io_nio\\ReadLines.java"));
            streamLines.map(String::toLowerCase).forEach(System.out::println);

            System.out.println("java8 BufferedReader ---------------------------------------------");
            BufferedReader br = Files.newBufferedReader(Paths.get(".\\src\\main\\java\\example\\java_programming_language\\io_nio\\ReadLines.java"));
            br.lines().map(String::toLowerCase).forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oldjavaBr != null) {
                try {
                    oldjavaBr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
