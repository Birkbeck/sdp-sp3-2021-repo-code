package DemoTwo;

public class Main {
  public static void main(String[] args) {
    AClass a = new AClass();
    System.out.println(a.thing);
    System.out.println(a.anotherThing);
    BClass b = new BClass(a);
  }
}
