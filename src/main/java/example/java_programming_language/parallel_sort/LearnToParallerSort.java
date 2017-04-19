package example.java_programming_language.parallel_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by sun on 2017-04-19.
 */
public class LearnToParallerSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Random r = new Random();

        for (int i = 0; i < 5000000; i++) {
            list.add(r.nextInt(1000));
        }

        Integer[] array1 = new Integer[list.size()];
        Integer[] array2 = new Integer[list.size()];

        array1 = list.toArray(array1);
        array2 = list.toArray(array2);

        long start = System.currentTimeMillis();
        Arrays.sort(array1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        Arrays.parallelSort(array2);
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
