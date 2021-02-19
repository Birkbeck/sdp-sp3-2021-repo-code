package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Mickey", "Simon", "Harold");

    for (String s : ls) {
      System.out.println(s);
    }

    for (Iterator it = ls.iterator();
         it.hasNext(); ) {
      System.out.println(it.next());
    }
  }
}
