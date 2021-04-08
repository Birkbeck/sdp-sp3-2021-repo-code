package driver;

import overloading.ANewImplementation;
import overloading.A;
import overloading.AImplementation;

public class AnotherMain {
  public static void main(String[] args) {
    A a = new AImplementation("a", "b");
    A a2 = new ANewImplementation("c","d");
    System.out.println(a.aMethod());
    System.out.println(a.anotherMethod());
    System.out.println(a2.aMethod());
    System.out.println(a2.anotherMethod());
  }
}
