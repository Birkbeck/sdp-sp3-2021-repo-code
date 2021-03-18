package mypackage;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> lstOne = List.of("a","b","e","f");
    List<String> lstTwo = List.of("x","y","z");

    var result = lstOne
      .stream()
      .flatMap(strOne -> lstTwo
        .stream()
        .map(strTwo -> new String[]{strOne, strTwo})
      ).collect(Collectors.toList());
    result.stream().forEach(str -> System.out.println(str[0] + "," + str[1]));
  }
}
