package wildcards;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {
    Collection<Shape> shapes = new ArrayList<>();
    drawAll(shapes);

    Collection<Rectangle> rects = new ArrayList<>();
    drawAll(rects);

  }

  public static void drawAll(Collection<? extends Shape> shapes){
    for (Shape s : shapes){
      s.draw();
    }
  }
}

class Shape {
  public void draw(){}
}

class Rectangle extends Shape {}

class Circle extends Shape {}
