package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SimpleReflect {
  public static void main(String[] args) {
    Object obj = new Person();
    Class c = obj.getClass();
    System.out.println(c.getName());
    System.out.println(c.getPackage());

    Field[] fields = c.getDeclaredFields();
    if (fields.length == 0){
      System.out.println("No fields available");
    }
    for (var f : fields){
      System.out.println("Field: " + f);
    }
    System.out.println();
    Method[] methods = c.getDeclaredMethods();    // getMethods();
    if (methods.length == 0){
      System.out.println("No methods available");
    }
    for (var m : methods){
      System.out.println("Method: " + m);
    }
    System.out.println();
    Constructor[] cons = c.getDeclaredConstructors(); //getConstructors();
    if (cons.length == 0){
      System.out.println("No constructors available");
    }
    for (var constructors : cons){
      System.out.println("Method: " + constructors);
    }
  }
}

class Person {
  private String name;
  private int age;
}
