package wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
  private LinkedList<T> items = new LinkedList<>();

  public void enqueue(T item) {
    items.addLast(item);
  }

  public T dequeue() {
    return items.removeFirst();
  }

  public boolean isEmpty() {
    return items.size() == 0;
  }

  public void addAll(Collection<? extends T> collection) { // read
    // Add all the items from the collection "collection" to the end of the queue
    for (T item : collection) {
      enqueue(item);
    }
  }

  public void addAllTo(Collection<? super T> collection) { // write
    // Remove all items from the queue and add them to the collection
    while (! isEmpty()){
      T item = dequeue(); // Remove an item from the queue.
      collection.add(item); // Add the item to the collection.
    }
  }

  public Collection<T> toCollection(){ // "bridge" method which converts a Queue to a Collection
    return items;
  }
}

class MainTwo {
  public static void main(String[] args) {
    Queue<Integer> q = new Queue<>();
    q.enqueue(5);
    q.enqueue(7);
//    Queue<Number> q2 = new Queue<>();
//    q2.enqueue(99);
//    q.addAll(q2); // expecting Collection<Number> received Queue<Number>

//    List<Integer> q2 = new ArrayList<>();
//    q2.add(99);
//    q.addAll(q2);

    Queue<Integer> q2 = new Queue<>();
    q2.enqueue(99);
    q.addAll(q2.toCollection());

    Collection<Number> ci = new ArrayList<>();
    q.addAllTo(ci);
  }
}
