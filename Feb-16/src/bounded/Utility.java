package bounded;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Utility {
  static <T extends Comparable<T>> void insertItemIntoSortedList(List<T> sortedList, T newItem){
    ListIterator<T> iter = sortedList.listIterator();

    while (iter.hasNext()){
      T item = iter.next();
      if (newItem.compareTo(item) <= 0){
        iter.previous();
        break;
      }
    }
    iter.add(newItem);
  }
}

class Main {
  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("a");
    ls.add("c");
    ls.add("e");
    ls.add("k");
    ls.add("m");
    System.out.println(ls);

    Utility.insertItemIntoSortedList(ls, "h");
    System.out.println(ls);

    List<Integer> li = new ArrayList<>();
    li.add(1);
    li.add(5);
    li.add(11);
    System.out.println(li);

    Utility.insertItemIntoSortedList(li, 13);
    System.out.println(li);

    List<Person> lp = new ArrayList<>();
    // ...
    // Utility.insertItemIntoSortedList(lp, new Person()); // Person doesn't implement Comparable
  }
}

class Person {}

