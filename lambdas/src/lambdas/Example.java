package lambdas;

import java.util.function.Predicate;

public class Example {
  public static void main(String[] args) {
    Example ex = new Example();
    MyInterface myInt = new MyClass();
    myInt.myMethod();

    MyInterface my = new MyInterface() {
      @Override
      public void myMethod() {
        // TODO
      }
    };

    my = () -> {
    };

    my = System.out::println;

    ex.myMethodInExample(() -> {
    });
    ex.myMethodInExample(new MyInterface() {
      @Override
      public void myMethod() {
        // TODO
      }
    });
  }

  public void myMethodInExample(MyInterface myInt) {
    myInt.myMethod();
  }

}

@FunctionalInterface
interface MyInterface {
  // could use a lambda here by assigning to a static field
  // or something similar
  Predicate<String> predStr = (x) -> true;

  void myMethod(); // SAM - Single Abstract Method

  //void myOtherMethod(); can't add this if we want to retain the "FunctionalInterface"
  static void myStaticMethod() {
  }

  default void myDefaultMethod() {
    helper();
  }

  private void helper() {
  }
}

class MyClass implements MyInterface {

  @Override
  public void myMethod() {
    // TODO
  }
}