package first;

import java.util.List;

class Main {
  public static void main(String... args){
    var rect1 = new Rectangle(3,4);
    System.out.println(rect1.getArea());
    
    var rect2 = new Rectangle(2,4);
    System.out.println(rect2.getArea());

    List<Rectangle> rects = List.of(rect1,rect2);
    System.out.println(rects);
    //System.out.println(rect1.getAreaOfRectangles(rects));
    //System.out.println(Rectangle.getAreaOfRectangles(rects));
    System.out.println(AreaCalculator.getAreaOfRectangles(rects));
 }

//  static void printList(List<?> listOfThing){
//    for (var l: listOfThing){
//      System.out.println(l);
//    }
//  }
}