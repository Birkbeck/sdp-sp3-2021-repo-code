package recursion;

import java.util.List;

public class SumLists {
  public static int sumList(List<Integer> ls) {
    if (ls.isEmpty()) {
      return 0;
    } else {
      return ls.get(0) + sumList(ls.subList(1, ls.size()));
    }
  }

  public static int sumListTail(List<Integer> ls) {
    return sumListHelper(ls, 0);
  }

  private static int sumListHelper(List<Integer> ls, int acc) {
    if (ls.isEmpty()) {
      return acc;
    } else {
      return sumListHelper(ls.subList(1, ls.size()), acc + ls.get(0));
    }
  }

  public static void main(String[] args) {
    System.out.println(sumList(List.of(1, 2, 3, 4, -5, 6, 7, 8, 9, 10)));
    System.out.println(sumListHelper(List.of(1, 2, 3, 4, -5, 6, 7, 8, 9, 10), 0));
  }
}
