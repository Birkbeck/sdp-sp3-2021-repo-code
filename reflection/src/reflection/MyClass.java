package reflection;

public class MyClass {
  public static void main(String[] args) {
    Class c;
    try {
      c = Class.forName("java.util.Properties");
      System.out.println(c.getName());
      System.out.println(c.getSimpleName());
      System.out.println(c.isInterface());
      System.out.println(c.getConstructors());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}