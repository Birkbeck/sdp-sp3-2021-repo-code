package threading;

import static java.lang.Thread.sleep;

public class SimpleThread implements Runnable {
  private final static int INTERVAL = 1000;
  private String name;

  public SimpleThread(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  @Override
  public void run() {
    for (var i = 0; i < 10; i++) {
      System.out.println(i + " " + getName());
      try {
        sleep((int) (Math.random() * INTERVAL));
      } catch (Exception ex) {
        System.err.println(ex.getMessage());
      }
    }
    System.out.println("Completed: " + getName());
  }
}
