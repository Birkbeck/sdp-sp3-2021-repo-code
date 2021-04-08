package threadingtwo;

import java.util.concurrent.TimeUnit;

public class Threads {
  public static void main(String[] args) {
    //testOne();
    testTwo();
  }

  private static void testOne(){
    Runnable runnable = () -> {
      String threadName = Thread.currentThread().getName();
      System.out.println("Hello " + threadName);
    };

    runnable.run();
    System.out.println("After 'run'");

    Thread thread = new Thread(runnable);
    thread.start();

    System.out.println("Done!");
  }

  private static void testTwo(){
    Runnable runnable = () -> {
      try {
        System.out.println("Foo " + Thread.currentThread().getName());
        //Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Fighters " + Thread.currentThread().getName());
      } catch (InterruptedException ex){
        ex.printStackTrace();
      }
    };

    runnable.run();

    Thread thread = new Thread(runnable);
    thread.start();
  }
}
