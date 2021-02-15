package raw;

public class Main {
  public static void main(String[] args) {
    QueueOfThings q = new QueueOfThings();

    q.enqueue(3);
    q.enqueue("Thing");
    q.enqueue(5.6);

    System.out.println(q);

    System.out.println(q.isEmpty());
    System.out.println(q.dequeue());
  }
}
