package demo;

public class Demo {

  private Demo(){}

  public static int divide(int a, int b) throws MyException{
    //throws Exception { // ArithmeticException, RuntimeException
    if (b < 0) {
      //throw new RuntimeException();
      throw new MyException();
    }
    return a/b;
  }
}
