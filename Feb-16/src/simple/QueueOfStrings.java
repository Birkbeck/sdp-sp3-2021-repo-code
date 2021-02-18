package simple;

import java.util.LinkedList;

public class QueueOfStrings {
  private LinkedList<String> items = new LinkedList<>();

  public void enqueue(String item){
    items.addLast(item);
  }

  public String dequeue(){
    return items.removeFirst();
  }

  public boolean isEmpty(){
    return items.size() == 0;
  }
}
