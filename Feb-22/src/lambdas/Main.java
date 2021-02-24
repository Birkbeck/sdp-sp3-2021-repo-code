package lambdas;

import java.util.Arrays;
import java.util.Comparator;

// Lambdas

class Main {
  public static void main(String[] args) {
    String[] words = {"a", "bbbb", "c", "ddd", "e"};

    printAll(words);

    Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
    printAll(words);

    Arrays.sort(words, Comparator.comparingInt(String::length));
    printAll(words);
  }

  private static void printAll(String[] arr) {
    for (var str : arr) {
      System.out.print(str + " ");
    }
    System.out.println();
  }
}
