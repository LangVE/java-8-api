package example.java_programming_language.concurrency;

import java.util.concurrent.atomic.LongAdder;

/**
 * Created by 이영호 on 2017-04-26.
 */
public class LearnToLongAdder {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        System.out.println("longAdder = " + longAdder);

        longAdder.add(1);
        System.out.println("longAdder = " + longAdder);

        longAdder.increment();
        System.out.println("longAdder = " + longAdder);

        longAdder.decrement();
        System.out.println("longAdder = " + longAdder);

        longAdder.increment();
        System.out.println("longAdder = " + longAdder);

        longAdder.sum();
        System.out.println("sum = " + longAdder);

        longAdder.reset();
        System.out.println("reset = " + longAdder);

    }
}
