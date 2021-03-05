package iterator;

import java.util.Iterator;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    var ls = List.of("Mickey", "Simon", "Harold");
    System.out.println(ls.getClass());

    for (String s : ls) {
      System.out.println(s);
    }

    Iterator it = ls.iterator();
    while (it.hasNext()){
      System.out.println(it.next());
    }

    for (Iterator iter = ls.iterator(); iter.hasNext(); ) {
      System.out.println(iter.next());
    }
  }
}