package example.java_programming_language.concurrency;

import java.util.concurrent.atomic.LongAccumulator;

/**
 * Created by 이영호 on 2017-04-26.
 */
public class LearnToLongAccumulator {
    public static void main(String[] args) {
        LongAccumulator acc = new LongAccumulator((a, b) -> a+b, 1L);
        System.out.println("acc = " + acc);

        acc.accumulate(3);
        System.out.println("acc = " + acc);

        acc.accumulate(3);
        System.out.println("acc = " + acc);
    }
}
