package q5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringUtils {
  public static List<String> allMatches(List<String> s, Predicate<String> predicate) {
    List<String> resultList = new ArrayList<>();
    for (String item : s) {
      if (predicate.test(item)) {
        resultList.add(item);
      }
    }
    return resultList;
  }
}

class Main {
  public static void main(String[] args) {
    List<String> words = List.of("hi", "hello", "hola", "bye", "goodbye", "adios");
    List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
    System.out.println(shortWords);

    List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
    System.out.println(wordsWithB);

    List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
    System.out.println(evenLengthWords);
  }
}
