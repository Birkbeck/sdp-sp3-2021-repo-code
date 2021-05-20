package mypackage;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> lstOne = List.of("a", "b", "e", "f");
    List<String> lstTwo = List.of("x", "y", "z");
    one(lstOne, lstTwo);
    two(lstOne, lstTwo);
  }

  private static void one(List<String> lstOne, List<String> lstTwo) {
    var result = lstOne
      .stream()
      .map(strOne -> lstTwo
        .stream()
        .map(strTwo -> new String[]{strOne, strTwo}) // returns a stream rather than the values
      ).collect(Collectors.toList());
    result.stream().forEach(System.out::println);
  }

  private static void two(List<String> lstOne, List<String> lstTwo) {
    var result = lstOne
      .stream()
      .flatMap(strOne -> lstTwo
        .stream()
        .map(strTwo -> new String[]{strOne, strTwo}) // returns the values as flatMap forces the evaluation.
      ).collect(Collectors.toList());
    result.stream().forEach(str -> System.out.println(str[0] + "," + str[1]));
  }
}
