package streams;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Iterations {
  public static void main(String[] args) {
    List<String> stringList = List.of("first", "second", "third", "lifeline", "stately", "tempest"); // factory method
//    stringList.stream()
//      .forEach(System.out::println);
//
//    IntStream.range(0,10)
//      .forEach(System.out::println);
//
//    "Hello world!!!".chars()
//      .forEach(System.out::print);
//    System.out.println();
//    "Hello world!!!".chars() // produces an IntStream
//      .forEach(x -> System.out.print((char) x));
//    System.out.println();

    List<String> filteredList = stringList.stream()
      .filter(s -> s.length() > 5)
      .collect(Collectors.toList());
    System.out.println(filteredList);

    List<String> mappedList = stringList.stream()
      .map(s -> s.substring(0, 1))
      .collect(Collectors.toList());
    System.out.println(mappedList);

    List<String> filteredMappedList =
      stringList.stream()
        .filter(s -> s.length() > 5)
        .map(s -> s.substring(0, 1))
        .distinct() // remove duplicates
        .sorted()
        .collect(Collectors.toList());
    System.out.println(filteredMappedList);
  }
}
