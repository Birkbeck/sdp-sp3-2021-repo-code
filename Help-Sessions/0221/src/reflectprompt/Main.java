package reflectprompt;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Class cl;
    try (var sc = new Scanner(System.in)) {
      System.out.print("Fully qualified name of the class: ");
      String classname = sc.nextLine();
      cl = Class.forName(classname);

      Constructor[] consarr = cl.getConstructors();
      if (consarr.length == 1) {
        Constructor c = consarr[0];
        Class[] parameters = c.getParameterTypes();
        Object[] values = new Object[parameters.length];

        for (var i = 0; i < parameters.length; i++) {
          System.out.print(parameters[i].getName() + ": ");
          values[i] = sc.nextLine();
        }
        Object o = c.newInstance(values); // new Construct("a", "b", 99, false)

        System.out.println(o);
      } else {
        System.out.println("Too many constructors to select from!");
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
      System.err.println(ex);
    }
  }
}
