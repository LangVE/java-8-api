package example.java_programming_language.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


/**
 * Created by 이상덕 on 2017-05-08.
 */
public class ReadWriteLockTest extends ConcurrentUtils {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        executor.submit(() -> {
            lock.writeLock().lock();
            try {
                sleep(1);
                map.put("foo", "bar");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
            }
        });

        Runnable readTask = () -> {
            lock.readLock().lock();
            try {
                System.out.println(map.get("foo"));
                sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        };

        executor.submit(readTask);
        executor.submit(readTask);

        stop(executor);
    }
}