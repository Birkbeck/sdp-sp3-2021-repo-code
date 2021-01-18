package singletonalt;

public class Client {
  public void doSomething() {
    // doing something
    MySingleton.getInstance().doX();
    // doing something else
    final int b = MySingleton.getInstance().getB();
    // do something with b
  }
}