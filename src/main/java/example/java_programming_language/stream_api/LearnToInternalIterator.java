package example.java_programming_language.stream_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by 이영호 on 2017-03-30.
 */
public class LearnToInternalIterator {

    public static List init() {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++) {
            list.add(i);
        }

        return list;
    }

    public static void print(Iterator<Integer> integerIterator) {
        while(integerIterator.hasNext()) {
            System.out.println(integerIterator.next().toString());
        }
    }

    public static void step1() {
        List<Integer> list = init();

        Stream<Integer> integerStream = list.stream();

        Iterator<Integer> integerIterator =  integerStream.skip(50)
                .limit(10)
                .iterator();

        print(integerIterator);
    }

    public static void step2() {
        List<Integer> list = init();

        Stream<Integer> integerStream = list.stream();

        Iterator<Integer> integerIterator =  integerStream.skip(50)
                .limit(10)
                .iterator();

        print(integerIterator);

        // error!
        integerIterator =  integerStream.skip(50)
                .limit(10)
                .iterator();

        print(integerIterator);
    }

    public static void step3() {
        List<Integer> list = init();

        list.stream().skip(50).limit(10).forEach(integer -> System.out.println(integer));
    }

    public static void step4() {
        List<Integer> list = init();

        list.stream().skip(50).limit(10).forEach(integer -> System.out.println(integer));

        // error?
        list.stream().limit(10).forEach(integer -> System.out.println(integer));
    }

    public static void main(String[] args) {

        step1();
//        step2();
//        step3();
//        step4();

    }
}
