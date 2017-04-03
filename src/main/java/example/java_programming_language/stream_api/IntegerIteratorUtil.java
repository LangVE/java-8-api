package example.java_programming_language.stream_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 이영호 on 2017-04-03.
 */
public final class IntegerIteratorUtil {
    public static List init(int size) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < size; i++) {
            list.add(i);
        }

        return list;
    }

    public static void print(Iterator<Integer> integerIterator) {
        while(integerIterator.hasNext()) {
            System.out.println(integerIterator.next().toString());
        }
    }
}
