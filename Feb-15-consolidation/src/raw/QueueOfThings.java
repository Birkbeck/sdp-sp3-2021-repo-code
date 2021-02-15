package raw;

import java.util.LinkedList;

public class QueueOfThings {
  private LinkedList items = new LinkedList();

  public void enqueue(Object item) {
    items.addLast(item);
  }

  public Object dequeue() {
    return items.removeFirst();
  }

  public boolean isEmpty() {
    return items.size() == 0;
  }
}
