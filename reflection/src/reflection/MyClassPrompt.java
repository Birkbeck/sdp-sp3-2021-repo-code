package reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MyClassPrompt {
  public static void main(String[] args) {
    Class c;
    try (var sc = new Scanner(System.in)) {
      System.out.print("The name of the class: ");
      String aclass = sc.next();
      c = Class.forName(aclass);
      //System.out.println(c);

      System.out.println(c.getName());
      System.out.println(c.getSimpleName());

      System.out.println(c.isInterface());

      // obtain the methods for this class
      Method[] m = c.getMethods();
      for (Method x : m) {
        System.out.println(x);
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}