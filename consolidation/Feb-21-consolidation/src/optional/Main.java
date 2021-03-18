package optional;

import java.sql.SQLOutput;
import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    Optional<String> optional = Optional.empty();
    System.out.println(optional.isPresent());
    System.out.println(optional.orElse("Result"));
    Optional<String> s = getThing();
    //System.out.println(s.orElse("").length());
    s.ifPresent(str -> System.out.println(str.length()));

    Optional<Integer> oi = Optional.of(15);
    boolean divisible = oi.filter(y -> y % 5 == 0).isPresent();
    System.out.println(divisible);
    divisible = oi.filter(y -> y % 4 == 0).isPresent();
    System.out.println(divisible);
  }

  private static Optional<String> getThing(){
    return Optional.ofNullable(null);
  }

  // a.meth().meth2().meth3()
}
