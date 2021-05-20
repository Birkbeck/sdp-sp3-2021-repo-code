package q8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
  public static void main(String[] args) {
    List<String> words = List.of("hi", "hello", "hola", "bye", "goodbye", "adios");
    System.out.printf("Original words: %s.%n", words);

    List<String> excitingWords = words.stream()
      .map(s -> s + "!")
      .collect(Collectors.toList());
    System.out.printf("Words: %s.%n", excitingWords);

    List<String> eyeWords = words.stream()
      .map(s -> s.replace("i", "eye"))
      .collect(Collectors.toList());
    System.out.printf("Words: %s.%n", eyeWords);

    List<String> upperCaseWords = words.stream()
      .map(s -> s.toUpperCase())
      .collect(Collectors.toList());
    System.out.printf("Words: %s.%n", upperCaseWords);
  }
}
