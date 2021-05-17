package q3;

@FunctionalInterface
interface TwoStringPredicate {
  boolean isBetter(String s1, String s2);
}

public class StringUtils {
  public static String betterString(String s1, String s2, TwoStringPredicate test) {
    return (test.isBetter(s1, s2)) ? s1 : s2;
  }
}

class Main {
  public static void main(String[] args) {
    String test1 = "Hello";
    String test2 = "Goodbye";
    String msg = "Better of %s and %s based on %s is %s.%n";
    var res = StringUtils.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
    System.out.printf(msg, test1, test2, "length", res);
    res = StringUtils.betterString(test1, test2, (s1, s2) -> true);
    System.out.printf(msg, test1, test2, "first item", res);
  }
}
