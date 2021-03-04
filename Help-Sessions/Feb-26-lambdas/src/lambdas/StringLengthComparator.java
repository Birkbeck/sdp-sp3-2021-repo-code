package lambdas;

import java.sql.SQLOutput;
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
    String[] words = {"hi", "hello", "hola", "bye", "goodbye", "adios"};
    printArray(words);
    //Arrays.sort(words, StringLengthComparator.INSTANCE);

    // Anonymous Inner Class
//    Arrays.sort(words, new Comparator() { // Class Instance Creation Expression (CICE)
//      @Override
//      public int compare(Object o1, Object o2) {
//        String s1 = (String) o1;
//        String s2 = (String) o2;
//        return s1.length() - s2.length();
//      }
//    });

    // Function objects in Java 5
//    Arrays.sort(words, new Comparator<String>() { // CICE with Generics
//      @Override
//      public int compare(String s1, String s2) {
//        return s1.length() - s2.length();
//      }
//    });


    // Function objects as Java lambdas
    Arrays.sort(words, (s1,s2) -> s1.length() - s2.length()); // declarative without "ceremony" (reduce syntax)
    printArray(words);
  }

  static <T> void printArray(T[] array){
    for (var item: array){
      System.out.print(item + ", ");
    }
    System.out.println();
  }
}
