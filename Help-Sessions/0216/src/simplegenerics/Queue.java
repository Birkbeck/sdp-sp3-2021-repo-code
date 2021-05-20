package simplegenerics;

import java.util.LinkedList;

public class Queue<Type> { // invariant type
  //private LinkedList<T> items = new LinkedList<>();

  public void enqueue(Type item){
    //items.addLast(item);
  }

  public Type dequeue(){
    return null;//items.removeFirst();
  }

  public boolean isEmpty(){
    return true; //items.size() == 0;
  }
}
