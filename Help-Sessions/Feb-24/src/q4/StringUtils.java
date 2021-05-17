package q4;

@FunctionalInterface
interface TwoElementPredicate<T> {
  boolean isBetter(T s1, T s2);
}

public class StringUtils {
  public static <T> T betterString(T s1, T s2,TwoElementPredicate<T> test) {
    return (test.isBetter(s1, s2)) ? s1 : s2;
  }
}

class Main {
  public static void main(String[] args) {
    String test1 = "Hello";
    String test2 = "Goodbye";
    String msg = "Better of %s and %s based on %s is %s.%n";
    var res = StringUtils.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
    System.out.printf(msg,test1,test2,"length",res);
    res = StringUtils.betterString(test1, test2, (s1, s2) -> true);
    System.out.printf(msg,test1,test2,"first item", res);
  }
}
