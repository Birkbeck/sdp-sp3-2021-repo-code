package simplegenerics;

public class Main {
  public static void main(String[] args) {
    Queue<String> qs = new Queue<>(); // raw type = Object
    qs.enqueue("First");
    qs.enqueue("Second");
    Queue<Integer> qi = new Queue<>();
    qi.enqueue(3);
    // blah blah blah
  }
}
