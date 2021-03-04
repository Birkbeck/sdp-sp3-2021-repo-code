package reflect;

public class SpyMain {
  public static void main(String[] args) {
    try {
      Spy someclass = Spy.getSpy("java.lang.String"); // or String.class to invoke the other getSpy method
      someclass.printAll(args); // just print info about the class
    } catch (ClassNotFoundException e) {
      System.err.println("Could not locate class file");
      e.printStackTrace();
    }
  }
}
