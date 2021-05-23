package stack;

import java.util.ArrayList;
import java.util.Optional;

public class StackImplementation<T> implements Stack<T> {
  private ArrayList<T> stack;

  public StackImplementation(){
    stack = new ArrayList<>();
  }

  public void push(T item){
    stack.add(item);
  }

  public boolean isEmpty(){
    return stack.isEmpty();
  }

  public Optional<T> peek(){
    Optional<T> item = pop();
    if (item.isPresent()){
     push(item.get());
    }
    return item;
  }

  public Optional<T> pop(){
    if (stack.isEmpty()){
      return Optional.empty();
    }
    return Optional.of(stack.remove(stack.size() -1));
  }
}