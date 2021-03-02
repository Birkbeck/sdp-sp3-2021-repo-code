package q4;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
  public static void main(String[] args) {
    List<Integer> intListOne = List.of(1, 2, 3);
    List<Integer> intListTwo = List.of(3, 4);

    var result =
      intListOne.stream().flatMap(i -> intListTwo.stream()
        .map(j -> new int[]{i, j})).collect(Collectors.toList());
    result.stream().forEach(System.out::println);
    //result.stream().forEach(i -> System.out.println(i[0] + "," + i[1]));
  }
}