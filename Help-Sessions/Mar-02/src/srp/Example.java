package srp;

import java.util.ArrayList;
import java.util.List;

interface Shape {
  double getArea();
}

public class Example {
  public static void main(String[] args) {
    var r1 = new Rectangle(3, 4);
    System.out.println(r1.getArea());
    var r2 = new Rectangle(2, 2);
    System.out.println(r2.getArea());
    var boxOfShapes = new ArrayList<Rectangle>();
    boxOfShapes.add(r1);
    boxOfShapes.add(r2);
    System.out.println(ShapeAreaCalculator.sumOfArea(boxOfShapes));

    var t1 = new Triangle(3,4);
    System.out.println(t1.getArea());
    var anotherBox = new ArrayList<Triangle>();
    anotherBox.add(t1);
    System.out.println(ShapeAreaCalculator.sumOfArea(anotherBox));
  }
}

class Rectangle implements Shape {
  private int length;
  private int width;

  Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double getArea() {
    return length * width;
  }
}

class Triangle implements Shape {
  private int height;
  private int width;

  Triangle(int height, int width){
    this.height = height;
    this.width = width;
  }

  @Override
  public double getArea() {
    return 0.5 * height * width;
  }
}

class ShapeAreaCalculator {
  static double sumOfArea(List<? extends Shape> lt){
    double sum = 0;
    for (Shape r : lt) {
      sum += r.getArea();
    }
    return sum;
  }
}
