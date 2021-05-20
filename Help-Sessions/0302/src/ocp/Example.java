package ocp;

import java.util.ArrayList;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    var r1 = new RectangleImpl(3, 4);
    System.out.println(r1.getArea());
    var r2 = new RectangleImpl(2, 2);
    System.out.println(r2.getArea());
    var boxOfShapes = new ArrayList<Shape>();
    boxOfShapes.add(r1);
    boxOfShapes.add(r2);
    System.out.println(ShapeAreaCalculator.sumOfArea(boxOfShapes));

    var t1 = new TriangleImpl(3,4);
    System.out.println(t1.getArea());
    var c1 = new CircleImpl(1.5);
    var anotherBox = new ArrayList<Shape>();
    anotherBox.add(t1);
    anotherBox.add(c1);
    System.out.println(ShapeAreaCalculator.sumOfArea(anotherBox));
  }
}