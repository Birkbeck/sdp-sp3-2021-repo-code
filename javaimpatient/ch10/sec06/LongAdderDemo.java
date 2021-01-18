package ch10.sec06;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderDemo {
    public static LongAdder count = new LongAdder();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 1000; i++) {
            Runnable task = () -> {
                for (int k = 1; k <= 100000; k++)
                    count.increment();
            };
            executor.execute(task);
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("Final value: " + count);
        
        LongAccumulator largest = new LongAccumulator(Long::max, 0);
        largest.accumulate(42L);
        long max = largest.get();
        System.out.println(max);
        
        ConcurrentHashMap<String,LongAdder> counts = new ConcurrentHashMap<>();
        for (String key : "Row, row, row a boat".split("\\PL+"))
            counts.computeIfAbsent(key, k -> new LongAdder()).increment();
        System.out.println(counts);
    }
}
