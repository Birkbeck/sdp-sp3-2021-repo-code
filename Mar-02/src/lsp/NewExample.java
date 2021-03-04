package lsp;

import java.util.ArrayList;

//
// This example breaks the LSP as one cannot substitute an instance
// of RogueShape for shape
// as it does not "handle" getArea
//
public class NewExample {
  public static void main(String... args){
    var lstOfShapes = new ArrayList<Shape>();
    Shape s = new RectangleImpl(3,4);
    s = new CircleImpl(3);
    lstOfShapes.add(s);
    s = new TriangleImpl(1,2);
    lstOfShapes.add(s);
    s = new RogueShape();
    lstOfShapes.add(s);
    System.out.println(lstOfShapes);
    for (Shape shape: lstOfShapes){
      System.out.println(shape.getArea());
    }
  }
}