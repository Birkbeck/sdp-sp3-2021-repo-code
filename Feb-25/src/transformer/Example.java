package transformer;

import java.util.List;
import java.util.stream.Collectors;

public class Example {
  public static void main(String[] args) {
    List<String> words = List.of("hi", "hello", "hola", "bye", "goodbye", "adios");

    List<String> filteredList =
      words
        .stream()
        .filter(s -> s.length() > 3)
        .collect(Collectors.toList()); // convert stream to list
    System.out.println(filteredList);

    List<String> mappedList =
      words
        .stream()
        .map(s -> s.substring(0, 2))
        .collect(Collectors.toList());
    System.out.println(mappedList);

    List<String> filterAndMappedList =
      words
        .stream()
        .filter(s -> s.length() > 3)
        .map(s -> s.substring(0, 1))
        .distinct()
        .sorted()
        .collect(Collectors.toList());
    System.out.println(filterAndMappedList);

    var stream = words.stream().distinct().sorted();
    System.out.println(stream);
  }
}
