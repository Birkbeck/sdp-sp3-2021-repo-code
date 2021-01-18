package ch10.sec07;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class QueueDemo {
    public static Queue queue = new Queue();
    public static Set<Object> set = ConcurrentHashMap.newKeySet();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 100; i++) {
            int taskId = i;
            executor.execute(() -> {
                for (int k = 1; k <= 1000; k++) 
                    queue.add(taskId * 1000 + k);
            });
            executor.execute(() -> {
                for (int k = 1; k <= 1000; k++) 
                    try {
                        set.add(queue.take());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            });
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("Final size: " + set.size());
    }
}