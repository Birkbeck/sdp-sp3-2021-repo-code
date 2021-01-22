package reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

import static java.lang.System.exit;

public class MyClassPrompt {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("MyClassPrompt <full class name including package>");
      exit(-1);
    }
    Class c;
    Scanner sc = null;
    try {
      //sc = new Scanner(System.in);
      //System.out.print("The name of the class: ");
      //String aclass = sc.next();
      c = Class.forName(args[0]);

      System.out.println(c.getName());
      System.out.println(c.getSimpleName());
//      System.out.println(c.isInterface());

      // obtain the methods for this class
      Method[] f = c.getMethods();
      for (Method x : f) {
        System.out.println(x);
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
//    } finally {
//      sc.close();
    }
  }
}