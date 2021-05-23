package stack;

import java.util.Optional;

public final class Main {
  public static void main(String... args){
    Stack<Integer> s = StackFactory.getInstance();
    s.push(3);
    System.out.println(s.isEmpty());
    s.peek().ifPresent(System.out::println);
    s.pop().ifPresent(System.out::println);
  }
}