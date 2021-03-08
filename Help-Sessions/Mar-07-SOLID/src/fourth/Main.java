package fourth;

import java.util.List;

class Main {
  public static void main(String... args){
    var rect1 = new Rectangle(3,4);
    System.out.println(rect1.area());
    
    var rect2 = new Rectangle(2,4);
    System.out.println(rect2.area());

    var circle1 = new Circle(2);
    System.out.println(circle1.area());

    var square1 = new Square(3.5);
    System.out.println(square1.area());

    var cube = new Cuboid();

    List<Shape> shapes = List.of(rect1,circle1, rect2, square1);
    System.out.println(shapes);
    System.out.println(AreaCalculator.areaOfShapes(shapes));
 }
}
