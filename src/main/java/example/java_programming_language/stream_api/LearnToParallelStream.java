package example.java_programming_language.stream_api;

import java.util.List;

import static example.java_programming_language.stream_api.IntegerIteratorUtil.init;

/**
 * Created by 이영호 on 2017-04-03.
 */
public class LearnToParallelStream implements Measurable{

    private static void step3() {
        List<Integer> list = init(10000);

        list.parallelStream().skip(50).limit(10).forEach(integer -> System.out.println(integer));
    }

    @Override
    public void execute() {
        List<Integer> list = init(10000000);

        list.parallelStream().filter( integer -> integer % 2 == 0 );
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.measure(new LearnToParallelStream());
    }
}
