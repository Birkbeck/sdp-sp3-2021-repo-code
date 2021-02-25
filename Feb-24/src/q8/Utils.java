package q8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Utils {
  private Utils() {
  }

  public static <T, R> List<R> transformedList(List<T> originals, Function<T, R> transformer) {
    List<R> results = new ArrayList<>();
    for (T original : originals) {
      R item = transformer.apply(original);
      results.add(item);
      //results.add(transformer.apply(original));
    }
    return results;
  }
}

class Main {
  public static void main(String[] args) {
    List<String> words = List.of("hi", "hello", "hola", "bye", "goodbye", "adios");
    List<String> excitingWords = Utils.transformedList(words, s -> s + "!");
    System.out.println(excitingWords);
    List<String> eyeWords = Utils.transformedList(words, s -> s.replace("i", "eye"));
    System.out.println(eyeWords);
    List<String> upperCaseWords = Utils.transformedList(words, String::toUpperCase);
    System.out.println(upperCaseWords);
  }
}
