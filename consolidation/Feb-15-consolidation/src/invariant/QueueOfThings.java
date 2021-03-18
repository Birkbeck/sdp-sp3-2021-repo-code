package invariant;

import java.util.LinkedList;

public class QueueOfThings<Type> {
  private LinkedList<Type> items = new LinkedList<>();

  public void enqueue(Type item) {
    items.addLast(item);
  }

  public Type dequeue() {
    return items.removeFirst();
  }

  public boolean isEmpty() {
    return items.size() == 0;
  }
}
