package threading;

public class Main {
  public static void main(String[] args) {
    new Thread(new SimpleThread("One")).start();
    new Thread(new SimpleThread("Two")).start();
    System.out.println("Finished main");
  }
}
