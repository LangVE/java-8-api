package example.java_programming_language.lang_and_util;

import java.util.Arrays;

/**
 * Created by 이영호 on 2017-04-19.
 */
public class LearnToParallelArraySorting {

    public static void main(String[] args) {

        int[] ints = {9, 8, 4, 3, 5, 7, 6, 2, 1};

        Arrays.parallelSort(ints);

        Arrays.stream(ints).forEach(System.out::println);
    }
}
