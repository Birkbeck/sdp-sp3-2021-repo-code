package wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Shape {
  public static void drawAll(Collection<? extends Shape> shapes){
    for (var s: shapes){
      s.draw();
    }
  }
  public abstract void draw();
}

class Main {
  public static void main(String[] args) {
    List<Shape> ls = new ArrayList<>();
    ls.add(new Rectangle());
    ls.add(new Oval());
    Shape.drawAll(ls);

    List<Rectangle> lr = new ArrayList<>();
    lr.add(new Rectangle());
    //lr.add(new Oval());
    Shape.drawAll(lr);
    // A Rectangle "isa" Shape BUT a Collection of Rectangles is not a Collection of Shapes
  }
}

class Rectangle extends Shape {
  @Override
  public void draw() {
    System.out.println(getClass().getName());
  }
}

class Oval extends Shape {
  @Override
  public void draw() {
    System.out.println(getClass().getName());
  }
}
