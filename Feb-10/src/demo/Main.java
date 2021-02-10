package demo;

public class Main {
  public static void main(String[] args) {
    Product prod = new MyProduct("First Product", 12);
    Product mop = new MyOtherProduct("First Product", 12);

    System.out.println(prod);
    System.out.println(mop);
    System.out.println(prod == mop);
    System.out.println(prod.equals(mop));
  }
}