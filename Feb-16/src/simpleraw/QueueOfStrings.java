package simpleraw;

import java.util.LinkedList;

public class QueueOfStrings {
  private LinkedList items = new LinkedList();

  public void enqueue(String item){
    items.addLast(item);
  }

  public String dequeue(){
    return (String)items.removeFirst();
  }

  public boolean isEmpty(){
    return items.size() == 0;
  }
}
