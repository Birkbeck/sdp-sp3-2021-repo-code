package invariant;

public class Main {
  public static void main(String[] args) {
    QueueOfThings<Number> q = new QueueOfThings<>();

    q.enqueue(3);
    //q.enqueue("Thing");
    q.enqueue(5.6);

    System.out.println(q);

    System.out.println(q.isEmpty());
    System.out.println(q.dequeue());

    Pairs<String,Integer> pOne = new Pairs<>("Fred", 99);
    Pairs<Double,String> pTwo = new Pairs<>(9.99, "Betty");
  }
}
