package thebasics;

import java.util.Arrays;
import java.util.Comparator;

// Function Objects

public class StringLengthComparator implements Comparator {
  private StringLengthComparator() {}

  public static final StringLengthComparator INSTANCE = new StringLengthComparator();

  @Override
  public int compare(Object o1, Object o2) {
    String s1 = (String) o1;
    String s2 = (String) o2;
    return s1.length() - s2.length();
  }
}

class Main {
  public static void main(String[] args) {
    String[] words = {"a", "bbbb", "c", "ddd", "e"};

    printAll(words);
    Arrays.sort(words,StringLengthComparator.INSTANCE);
    printAll(words);
  }

  private static void printAll(String[] arr){
    for (var str: arr){
      System.out.print(str + " ");
    }
    System.out.println();
  }
}
