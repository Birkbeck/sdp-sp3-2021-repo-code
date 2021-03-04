package mighthelp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ThingFactory {
  // static factory method

  public static Thing getInstance(String s) {
    Thing t = new NotImplemented();
    StringBuilder sb = new StringBuilder().append("mighthelp.").append(s).append("Implementation");

    String className = sb.toString();

    //System.out.println(className);

    try {
      Class c = Class.forName(className);
      Constructor[] cons = c.getConstructors();
      t = (Thing) cons[0].newInstance();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
      InvocationTargetException e) {
    }
    return t;
  }
}