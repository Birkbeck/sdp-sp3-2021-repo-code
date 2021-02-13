package synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedOne {
  private final static int LIMIT = 10000;
  private static int count = 0;

  public static void main(String[] args) {
    testIncrement(SynchronizedOne::increment, "Non: ");
    testIncrement(SynchronizedOne::incrementSync, "Method Sync: ");
    testIncrement(SynchronizedOne::incrementSyncTwo, "Code Sync: ");
  }

  private static void testIncrement(Runnable r, String txt) {
    count = 0;

    ExecutorService executor = Executors.newFixedThreadPool(2);

    IntStream.range(0, LIMIT).forEach(i -> executor.submit(r));

    stop(executor);

    System.out.println(txt + count);
  }

  private static void increment() {
    count = count + 1;
  }

  private static synchronized void incrementSync() {
    count = count + 1;
  }

  private static void incrementSyncTwo() {
    synchronized (SynchronizedOne.class) {
      count = count + 1;
    }
  }

  private static void stop(ExecutorService executor) {
    try {
      executor.shutdown();
      executor.awaitTermination(60, TimeUnit.SECONDS);
    } catch (InterruptedException ex) {
      System.err.println("Termination interrupted");
    } finally {
      if (!executor.isTerminated()) {
        System.err.println("Killing non-completed tasks");
        executor.shutdownNow();
      }
    }
  }
}
