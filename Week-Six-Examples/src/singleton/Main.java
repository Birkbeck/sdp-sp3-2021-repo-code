package singleton;

public class Main {
  public static void main(String[] args) {
    //OneAndOnly o;
    OneAndOnly o = OneAndOnly.getInstance();
    o.setaField("Set");
    System.out.println(o);
    var p = OneAndOnly.getInstance();
    System.out.println(p);
  }
}
