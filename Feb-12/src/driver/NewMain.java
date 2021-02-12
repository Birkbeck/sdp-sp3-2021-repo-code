package driver;

import demo.Demo;
import demo.MyException;

public class NewMain {
  public static void main(String[] args) throws MyException {
    try {
      System.out.println(Demo.divide(3, -4));
    } catch (ArithmeticException e) {
      System.err.println("An error occurred: " + e.getMessage());
    } catch (RuntimeException e) {
      System.err.println("Artificial error");
    }

    System.out.println("Continuing...");
    try {
      System.out.println(Demo.divide(0, 1));
    } catch (ArithmeticException e) {
      System.err.println("An error occurred: " + e.getMessage());
    } catch (RuntimeException e) {
      System.err.println("Artificial error");
    } catch (Exception e) {
      System.err.println("Catch all");
    }

    try {
      System.out.println(Demo.divide(0, 0));
    } catch (ArithmeticException e) {
      System.err.println("An error occurred: " + e.getMessage());
    } catch (RuntimeException e) {
      System.err.println("Artificial error");
    } catch (Exception e) {
      System.err.println("Catch all");
    } finally {
      System.out.println("We are done");
    }
  }
}
