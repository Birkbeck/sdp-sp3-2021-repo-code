package collectors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToUnmodifiableSetExample {
  public static void main(String[] args) {
    Set<Integer> set = IntStream.range(1, 5)
      .boxed()
      .collect(Collectors.toUnmodifiableSet());
    System.out.println(set);
    System.out.println(set.getClass().getTypeName());
  }
}
