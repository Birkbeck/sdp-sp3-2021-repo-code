package driver;

import demo.A;
import demo.AImpl;
import demo.YetAnotherAImpl;
import otherdemo.AnotherAImpl;

public class Main {
  public static void main(String[] args) {
    A a = new AImpl("String One", "String Two");
    A a2 = new AnotherAImpl();
    A a3 = new YetAnotherAImpl("String One", "String Two");
    //BClass b = new BClassImpl("String");
    System.out.println(a);
    //System.out.println(a2);
    System.out.println(a3);

    System.out.println(a == a3);
    System.out.println(a.equals(a3));
  }
}
