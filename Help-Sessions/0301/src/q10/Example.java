package q10;

import java.util.List;

public class Example {
  public static void main(String[] args) {
    List<String> words = List.of("hi", "hello", "hola", "bye", "goodbye", "adios");
    System.out.printf("Original words: %s.%n", words);

    var result = words.stream()
      .map(s -> s.toUpperCase())
      .map(s -> func(s))
      .map(s -> s.replace("B", "@"))
      .filter(s -> s.length() < 4)
      .filter(s -> s.contains("E"))
      .findFirst();
    System.out.println(result.orElse("Nothing"));
  }

  static String func(String s){
    System.out.println("Transformation of "  + s);
    return s;
  }
}
