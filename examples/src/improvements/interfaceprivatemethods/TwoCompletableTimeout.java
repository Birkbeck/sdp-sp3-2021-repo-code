package improvements.interfaceprivatemethods;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class TwoCompletableTimeout {
  public static CompletableFuture<Integer> create(boolean passOnTimeout) {
    CompletableFuture<Integer> future = new CompletableFuture<Integer>()
            .thenApply(e -> e + 1);

    future = passOnTimeout ? future.completeOnTimeout(10, 2, TimeUnit.SECONDS)
            : future.orTimeout(2, TimeUnit.SECONDS);

    future.exceptionally(throwable -> {
      System.out.println(throwable);
      throw new RuntimeException("failed");
    })
            .thenAccept(e -> System.out.println(e));
    return future;
  }

  public static void main(String[] args) {
    {
      CompletableFuture<Integer> future = create(true);
      sleep(1000);
      future.complete(1);
    }

    {
      CompletableFuture<Integer> future = create(true);
      sleep(3000);
      future.complete(1);
    }

    {
      CompletableFuture<Integer> future = create(false);
      sleep(3000);
      future.complete(1);
    }
  }

  private static boolean sleep(int ms) {
    try {
      Thread.sleep(ms);
      return true;
    } catch (InterruptedException e) {
      return false;
    }
  }

  public int getNumberOfCores() {
    return 0;
  }
}
