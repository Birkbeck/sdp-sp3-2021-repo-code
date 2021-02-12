package driver;

import demo.Demo;
import demo.MyException;

public class Main {
  public static void main(String[] args) {// throws MyException {
    try {
      System.out.println(Demo.divide(3, 4));
      System.out.println(Demo.divide(0, 1));
      //System.out.println(Demo.divide(4, -2));
      System.out.println(Demo.divide(0, 0));
      System.out.println(Demo.divide(1, 0));
    } catch (MyException e) {
      System.err.println(e.getMessage());
    } catch (ArithmeticException e) {
      System.err.println("An error occurred: " + e.getMessage());
    } catch (RuntimeException e) {
      System.err.println("Artificial error");
    } finally {
      System.out.println("We are done");
    }
  }
}
