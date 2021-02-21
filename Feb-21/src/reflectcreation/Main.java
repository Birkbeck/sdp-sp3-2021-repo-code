package reflectcreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) {
    Class cl;
    try {
      String classname = "reflectcreation.Construct";
      cl = Class.forName(classname);

      Class[] arguments = {String.class, String.class, Integer.class, Boolean.class};

      Constructor cons = cl.getConstructor(arguments);

      Object o = cons.newInstance("a", "b", 99, false); // new Construct("a", "b", 99, false)

      System.out.println(o);

    } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
      System.err.println(ex);
    }
  }
}
