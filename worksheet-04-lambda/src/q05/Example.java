package q5;

import java.util.List;
import java.util.stream.Collectors;

public class Example {
  public static void main(String[] args) {
    List<Integer> listOne = List.of(1, 2, 3);
    List<Integer> listTwo = List.of(3, 4);

    var result = listOne.stream()
      .flatMap(i -> listTwo.stream()
        .filter(j -> (i + j) % 3 == 0)
        .map(j -> List.of(i, j)))
      .collect(Collectors.toList());
    result.stream().forEach(item -> System.out.print(item + " "));


  }
}
