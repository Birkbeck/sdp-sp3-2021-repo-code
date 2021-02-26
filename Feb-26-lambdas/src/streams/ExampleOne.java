package streams;

import java.util.List;
import java.util.stream.IntStream;

public class ExampleOne {
  public static void main(String[] args) {
    List<String> words = List.of("hi", "hello", "hola", "bye", "goodbye", "adios");

    // iterate over a collection
//    for (String s: words){
//      System.out.print(s + ", ");
//    }
//    System.out.println();
//
//    words.stream().forEach(s -> System.out.print(s + ", "));
//    System.out.println();
//
//    words.stream().parallel().forEach(s -> System.out.print(s + ", "));
//    System.out.println();

    // Iteration over a range of integers
    //IntStream.range(0,10).forEach(System.out::println);

    // Oddity
    "Hello world!".chars().forEach(System.out::print);
    System.out.println();
    "Hello world!".chars().forEach(i -> System.out.print((char) i));
    System.out.println();
  }
}
