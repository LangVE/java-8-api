package example.java_programming_language.stream_api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 이영호 on 2017-04-05.
 */
public class LearnToLazy {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person("m", "10"));
        list.add(new Person("m", "12"));
        list.add(new Person("w", "10"));
        list.add(new Person("m", "10"));
        list.add(new Person("m", "23"));
        list.add(new Person("w", "10"));
        list.add(new Person("m", "34"));
        list.add(new Person("w", "67"));
        list.add(new Person("w", "40"));

        list.stream().filter((p) -> p.getGender().equals("m"))
                .filter((p) -> Integer.parseInt(p.getAge()) < 15)
                .forEach((p) -> System.out.println("end"));
    }
}
