package example.java_programming_language.stream_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static example.java_programming_language.stream_api.IntegerIteratorUtil.init;
import static example.java_programming_language.stream_api.IntegerIteratorUtil.print;


/**
 * Created by 이영호 on 2017-03-30.
 */
public class LearnToExternalIterator implements Measurable{

    private LearnToExternalIterator(){
    }

    private static Iterator skip(Iterator iterator, int skipCount) {
        int loopCount = 0;

        while(iterator.hasNext()) {
            if(skipCount > loopCount) {
                iterator.next();
                iterator.remove();
                loopCount++;
            }
            else {
                break;
            }
        }

        return iterator;
    }

    private static Iterator<Integer> limit(Iterator<Integer> integerIterator, int limitCount) {
        int loopCount = 0;
        List<Integer> resultList = new ArrayList<Integer>();

        while(integerIterator.hasNext()) {
            if (loopCount < limitCount) {
                resultList.add(integerIterator.next());
            }
            else {
                break;
            }
            loopCount++;
        }

        return resultList.iterator();
    }



    private static void step3() {
        List<Integer> integerList = init(10000);

        Iterator<Integer> integerIterator = integerList.iterator();

        integerIterator = skip(integerIterator, 50);

        integerIterator = limit(integerIterator, 10);

        print(integerIterator);
    }

    private static Iterator<Integer> filterDivision(Iterator<Integer> integerIterator, int number) {

        while(integerIterator.hasNext()) {

            int n = integerIterator.next();

            if((n % number == 0)) {
                System.out.println( "Theard name(" + n + ") : " + Thread.currentThread().getName());

                integerIterator.remove();
            }
        }



        return integerIterator;
    }

    @Override
    public void execute() {
        List<Integer> integerList = init(1000000);

        Iterator<Integer> integerIterator = integerList.iterator();

        filterDivision(integerIterator, 2);
    }

    public static void main(String[] args) {
        //step3();
        StopWatch stopWatch = new StopWatch();
        stopWatch.measure(new LearnToExternalIterator());

    }
}
