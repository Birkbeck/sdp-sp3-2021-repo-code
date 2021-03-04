package artificial;

/* Illustrates the use of package and protected access modifiers */

import DemoTwo.AClass;

public class Main {
  public static void main(String[] args) {
    AClass a = new AClass();
    // System.out.println(a.thing); // Cannot access the field "thing"
    ASubClass as = new ASubClass();
    System.out.println(as.getAnotherThing());
  }
}
