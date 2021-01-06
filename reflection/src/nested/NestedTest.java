package nested;

import java.lang.reflect.Field;

public class NestedTest {
  private static int x = 5;

  public static void main(String[] args) throws Exception {
    Nested.doSomething();
    System.out.println(NestedTest.x);
  }

  public static class Nested {
    public static void doSomething() throws Exception {
      Field x = NestedTest.class.getDeclaredField("x");
      //x.setAccessible(true); --- needed prior to Java 11
      x.setInt(null, 10);
    }
  }
}
