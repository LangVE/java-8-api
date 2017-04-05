package example.java_programming_language.stream_api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 이영호 on 2017-04-05.
 */
public class LearnToLazy {
    public static volatile int order = 0;

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person("A","m", "10"));
        list.add(new Person("B","m", "12"));
        list.add(new Person("C","w", "10"));
        list.add(new Person("D","m", "10"));
        list.add(new Person("E","m", "23"));
        list.add(new Person("F","w", "10"));
        list.add(new Person("G","m", "34"));
        list.add(new Person("H","w", "67"));
        list.add(new Person("I","w", "40"));
        list.add(new Person("J","w", "50"));

        list.stream().filter((p) -> p.getGender().equals("m"))
                .filter((p) -> Integer.parseInt(p.getAge()) < 15)
                .forEach((p) -> System.out.println(String.format("End name : %s", p.getName())));
    }
}
