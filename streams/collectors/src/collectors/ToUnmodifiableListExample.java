package collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToUnmodifiableListExample {
  public static void main(String[] args) {
    List<Integer> list = IntStream.range(1, 5)
      .boxed()
      .collect(Collectors.toUnmodifiableList());
    System.out.println(list);
    System.out.println(list.getClass().getName());
  }
}
