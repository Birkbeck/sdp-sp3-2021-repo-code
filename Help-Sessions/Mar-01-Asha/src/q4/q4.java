package q4;

import java.util.List;
import java.util.stream.Collectors;

public class q4 {
  public static void main(String[] args) {
    List<Integer> listOne = List.of(1, 2, 3);
    List<Integer> listTwo = List.of(3, 4);

    var result = listOne.stream()
      .flatMap(i -> listTwo.stream()
        .map(j -> List.of(i, j))).collect(Collectors.toList());
    result.stream().forEach(item -> System.out.print(item + " "));
  }
}
