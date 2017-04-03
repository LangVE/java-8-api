package example.java_programming_language.stream_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static example.java_programming_language.stream_api.IntegerIteratorUtil.init;
import static example.java_programming_language.stream_api.IntegerIteratorUtil.print;

/**
 * Created by 이영호 on 2017-03-30.
 */
public class LearnToInternalIterator implements Measurable{

    public static void step1() {
        List<Integer> list = init(100);

        Stream<Integer> integerStream = list.stream();

        Iterator<Integer> integerIterator =  integerStream.skip(50)
                .limit(10)
                .iterator();

        print(integerIterator);
    }

    public static void step2() {
        List<Integer> list = init(100);

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
        List<Integer> list = init(10000);

        list.stream().skip(50).limit(10).forEach(integer -> System.out.println(integer));
    }

    public static void step4() {
        List<Integer> list = init(100);

        list.stream().skip(50).limit(10).forEach(integer -> System.out.println(integer));

        // error?
        list.stream().limit(10).forEach(integer -> System.out.println(integer));
    }

    @Override
    public void execute() {
        List<Integer> list = init(100000);

        list.stream().filter(integer -> integer % 2 == 0)
            .forEach((n) -> System.out.println( "Theard name(" + n + ") : " + Thread.currentThread().getName()));
    }

    public static void main(String[] args) {

//        step1();
//        step2();
//        step3();
//        step4();

        StopWatch stopWatch = new StopWatch();
        stopWatch.measure(new LearnToInternalIterator());
    }
}
