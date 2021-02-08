package collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToUnmodifiableMapExample {
  public static void main(String[] args) {
    Map<Integer, Double> map =
      IntStream.range(1, 5)
        .boxed()
        .collect(Collectors.toUnmodifiableMap(
          i -> i,
          i -> Math.pow(i, 3))
        );
    System.out.println(map);
    System.out.println(map.getClass().getTypeName());
  }
}
