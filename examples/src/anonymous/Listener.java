package anonymous;

public class Listener {

  public String addListener(SomeInterface s) {
    return "";
  }

  public static void main(String[] args) {
    Listener ls = new Listener();
//    ls.addListener(new MySomeInterface());
//    ls.addListener(new MySomeInterfaceAgain());
    // ...
//    ls.addListener(new SomeInterface() {  // Anonymous Inner Class - AIC
//      @Override
//      public void myMethod() {
//        // TODO
//      }
////      @Override
////      public void myOtherMethod() {
////        // TODO
////      }
//    });
    String str = ls.addListener(() -> "asdad");
  }
}

@FunctionalInterface
interface SomeInterface {
  String myMethod();
//  void myOtherMethod();
}

//class MySomeInterface implements SomeInterface {
//
//  @Override
//  public void myMethod() {
//    // TODO
//  }
//}
//
//class MySomeInterfaceAgain implements SomeInterface {
//
//  @Override
//  public void myMethod() {
//    // TODO
//  }
//}