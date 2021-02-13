package threading;

public class NewMain {
  public static void main(String[] args) {
    Thread one = new Thread(new SimpleThread("One"));
    Thread two = new Thread(new SimpleThread("Two"));

    one.start();
    two.start();
    System.out.println("Both threads start...");

    try {
      one.join();
    } catch (InterruptedException ex) {
      System.err.println("One - " + ex.getMessage());
    } finally {
      System.out.println("One join...");
    }
    try {
      two.join();
    } catch (InterruptedException ex) {
      System.err.println("Two - " + ex.getMessage());
    } finally {
      System.out.println("Two join...");
    }
    System.out.println("Finished main");
  }
}
