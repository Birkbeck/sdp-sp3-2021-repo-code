package iteration;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
  public static void main(String[] args) {
    // Iteration over a collection
//    List<String> words = List.of("hi", "hello", "hola", "bye", "goodbye", "adios");
//    for (var s: words){
//      System.out.print(s + " ");
//    }
//    System.out.println();
//
//    words.stream().forEach(s -> System.out.print(s + " "));
//    System.out.println();

    // Iteration over a range of integers
    // IntStream.range(0,10).forEach(System.out::println); // declarative

    // What does this print?
    "Hello World!".chars().forEach(i -> System.out.println(i + " is " + (char) i));
    // IntStream---------|
    System.out.println();
    //Stream.of("Hello World!").forEach(i -> System.out.println(i));
  }
}