package erasure;

public class EdgeCase {
}

class Stack<T> {
  void push(T item){ }
  T pop(){ return null;}
  // push pop
}

class IntegerStack extends Stack<Integer> {
  void push(Integer value){ }
  Integer pop() { return 99;}
  // ...
}
class MainEdge {
  public static void main(String[] args) {
    IntegerStack is = new IntegerStack();
    Stack stack = is;
    stack.push("Hello");
    Integer item = is.pop();
  }
}