package mypackage;

public class MyClass {
  public static void main(String[] args) {
    try {
      Class cl = Class.forName(args[0]);
      int noOfArgs = args.length - 1;
      Class[] arguments = new Class[noOfArgs];
      for (var index=0; index < noOfArgs; index++){
        arguments[index] = String.class;
      }
      cl.getConstructor(arguments);
    } catch (ClassNotFoundException | NoSuchMethodException e) {
      e.printStackTrace();
    }
  }

}

class AnotherClass {
  public AnotherClass(String s, String t, String w){

  }
}
