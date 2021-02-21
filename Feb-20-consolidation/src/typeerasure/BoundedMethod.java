package typeerasure;

public class BoundedMethod {
  //  public static <T extends Shape> void draw(T shape) {}
  public static void draw(Shape shape) {
  }
}

class Shape {
}

class Circle extends Shape {
}

class Rectangle extends Shape {
}