package lambdasanonymous;

import java.util.function.Supplier;

// Subtle difference between lambdas and anonymous class instances
public class Enclosing {
  Supplier<?> lambda() {
    return () -> this;
  }

  Supplier<?> anon() {
    return new Supplier<Object>() {
      @Override
      public Object get() {
        return this;
      }
    };
  }

  public static void main(String[] args) {
    Enclosing enclosing = new Enclosing();
    Object lambdaThis = enclosing.lambda().get();
    Object anonThis = enclosing.anon().get();
    System.out.println(anonThis == enclosing); // false
    System.out.println(anonThis.getClass());
    System.out.println(lambdaThis == enclosing); // true
    System.out.println(lambdaThis.getClass());
  }
}
