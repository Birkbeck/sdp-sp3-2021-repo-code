package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class StringLengthComparator implements Comparator {
  private StringLengthComparator() {}
  public static final StringLengthComparator INSTANCE = new StringLengthComparator();

  @Override
  public int compare(Object o1, Object o2) {
    String s1 = (String) o1, s2 = (String) o2; // don't do this
    return s1.length() - s2.length();
  }
}

class Main {
  public static void main(String[] args) {
    String[] words = {"a","bbb","cc", "d"};
    printArray(words);
    //Arrays.sort(words, StringLengthComparator.INSTANCE);
    // Function objects
//    Arrays.sort(words, new Comparator(){
//      @Override
//      public int compare(Object o1, Object o2) {
//        String s1 = (String) o1, s2 = (String) o2; // don't do this
//        return s1.length() - s2.length();
//      }
//    });
    // Function objects with Java Generics
    Arrays.sort(words, new Comparator<String>() {
      public int compare(String s1, String s2) {
        return s1.length() - s2.length();
      }
    });
    // Now "so called" Java lambda expressions but they are actually just "Class Instance Creation Expressions (CICE)"
    Arrays.sort(words, (s1,s2) -> s1.length() - s2.length());
    printArray(words);
  }

  private static <T> void printArray(T[] array){
    for (T t: array){
      System.out.print(t + "\t");
    }
    System.out.println();
  }
}