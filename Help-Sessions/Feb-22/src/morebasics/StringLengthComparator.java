package morebasics;

import java.util.Arrays;
import java.util.Comparator;

// Function Objects - Class Instance Creation Expression (CICE)

class Main {
  public static void main(String[] args) {
    String[] words = {"a", "bbbb", "c", "ddd", "e"};

    printAll(words);

//    Arrays.sort(words, new Comparator() { // use anonymous classes feature of Java
//      // Creates a new instance of an anonymous class which implements the interface
//      @Override
//      public int compare(Object o1, Object o2) {
//        String s1 = (String) o1;
//        String s2 = (String) o2;
//        return s1.length() - s2.length();
//      }
//    });
    Arrays.sort(words, new Comparator<String>() {  // CICE with Java Generics
      @Override
      public int compare(String s1, String s2) {
        return s1.length() - s2.length();
      }
    });
    printAll(words);
  }

  private static void printAll(String[] arr) {
    for (var str : arr) {
      System.out.print(str + " ");
    }
    System.out.println();
  }
}
