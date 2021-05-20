package q6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringUtils {
  public static <T> List<T> allMatches(List<T> s, Predicate<T> predicate) {
    List<T> resultList = new ArrayList<>();
    for (T item : s) {
      if (predicate.test(item)) {
        resultList.add(item);
      }
    }
    return resultList;
  }
}

class Main {
  public static void main(String[] args) {
    var words = List.of("hi", "hello", "hola", "bye", "goodbye", "adios");
    List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
    System.out.println(shortWords);

    var wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
    System.out.println(wordsWithB);

    var evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
    System.out.println(evenLengthWords);
  }
}
