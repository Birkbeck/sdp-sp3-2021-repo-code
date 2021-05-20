package streams;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleTwo {
  public static void main(String[] args) {
    List<String> words = List.of("hi", "hello", "hola", "goodbye", "bye", "goodbye", "adios");

    System.out.println(words);

    List<String> filteredList =
      words
        .stream()
        .filter(s -> s.length() > 4)
        .map(s -> s.substring(0,2) )
        .sorted()
        .distinct()
        .collect(Collectors.toList());

    System.out.println(filteredList);
  }
}
