package sun.javastudy.main.java.sun.javastudy.concurrency;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by 최선 on 2017-04-27.
 */
public class LearnToConcurrentHashMap {
    private static final int MAX_THREADS = 10;

    private static HashMap<String, Integer> hm = new HashMap<>();
    private static ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(MAX_THREADS);

        for( int j = 0 ; j < MAX_THREADS; j++ ){
            es.execute(new Runnable() {
                @Override
                public void run() {
                    for( int i = 0; i < 2000; i++ ){

                        String key = String.valueOf(i);

                        hm.put(key, i);
                        chm.put(key, i);

                    }
                }
            });
        }
        es.shutdown();
        try {
            es.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("HashMap size is "+ hm.size());
        System.out.println("ConcurrentHashMap size is "+ chm.size());

	    ConcurrentHashMap<String, Integer> chm2 = new ConcurrentHashMap<>();

	    for (int k = 0; k < 20; k++){
	        String key = String.valueOf(k);

	        chm2.put(key, k);
        }

        chm2.forEachValue(5, System.out::println);

//        chm2.forEach((key, value) -> System.out.println(key +": " + value));

        String searchStr = chm2.search(1, (k, v) -> {
            if(String.valueOf(v).contains("1")){
                return new String(k + ": " +v);
            }
            return null;
        });
//        System.out.println(searchStr);
    }
}
