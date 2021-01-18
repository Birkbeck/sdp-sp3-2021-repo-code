package ch10.sec06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongDemo {
    public static AtomicLong count = new AtomicLong();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 1000; i++) {
            int taskId = i;
            Runnable task = () -> {
                for (int k = 1; k <= 10000; k++)
                    count.incrementAndGet();
                System.out.println(taskId + ": " + count);
            };
            executor.execute(task);
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("Final value: " + count);
    }
}