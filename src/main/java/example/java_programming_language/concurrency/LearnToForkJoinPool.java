package example.java_programming_language.concurrency;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Created by langve on 2017. 5. 15..
 */
public class LearnToForkJoinPool {

    public static void parallelByExecutorService() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            futures.add(executor.submit(() -> {
                Thread.sleep(5000);
                return Thread.currentThread().getName() + ", index=" + index + ", ended at " + new Date();
            }));
        }

        for (Future<String> eachFuture: futures) {
            String result = eachFuture.get();
            System.out.println("Thread result: " + result);
        }
        executor.shutdown();
    }

    public static final void parallelByStream() {
        IntStream.range(0, 10).parallel().forEach(index -> {
            System.out.println("Starting " + Thread.currentThread().getName() + ",    index=" + index + ", " + new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) { }
        });
    }

    public static void parallelByCustomPool() throws ExecutionException, InterruptedException {
        ForkJoinPool myPool = new ForkJoinPool(5);
        System.out.println("ForkJoinPool.getCommonPoolParallelism() : " + ForkJoinPool.getCommonPoolParallelism());

        myPool.submit(() -> {
            parallelByStream();
        }).get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // compare result!!
        // step1
//        parallelByExecutorService();
        // step2
//        parallelByStream();
        // step3
        parallelByCustomPool();

    }
}
