package example.java_programming_language.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by 이상덕 on 2017-04-27.
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args){

        System.out.println("the number of threads : " + ForkJoinPool.getCommonPoolParallelism());
        System.out.println("------------------------------------------------------------------");

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        map.put("9", "nine");
        map.put("10", "ten");

        map.forEach(1, (key, value) ->
                System.out.printf("key: %s; value: %s; thread: %s\n",
                        key, value, Thread.currentThread().getName()));


    }
}
