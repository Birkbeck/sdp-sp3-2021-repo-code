package bounded;

import java.util.List;

public class Main {
  public static void main(String[] args) {

  }

  static void sortedInsertString(List<String> sortedList, String newItem) {
    var iter = sortedList.listIterator();
    while (iter.hasNext()) {
      var item = iter.next();
      if (newItem.compareTo(item) <= 0) {
        iter.previous();
        break;
      }
    }
    iter.add(newItem);
  }

  static <T extends Comparable<T>> void sortedInsert(List<T> sortedList, T newItem) {
    var iter = sortedList.listIterator();
    while (iter.hasNext()) {
      var item = iter.next();
      if (newItem.compareTo(item) <= 0) {
        iter.previous();
        break;
      }
    }
    iter.add(newItem);
  }
}