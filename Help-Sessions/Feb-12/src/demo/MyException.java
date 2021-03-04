package demo;

public class MyException extends Exception {
  @Override
  public String getMessage() {
    return getClass().getName() + " and everything has gone wrong";
  }
}
