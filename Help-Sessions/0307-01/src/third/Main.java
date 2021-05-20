package third;

import java.util.List;

class Main {
  public static void main(String... args){
    var rect1 = new Rectangle(3,4);
    System.out.println(rect1.getArea());
    
    var rect2 = new Rectangle(2,4);
    System.out.println(rect2.getArea());

    var circle1 = new Circle(2);
    System.out.println(circle1.getArea());

    var square1 = new Square(3.5);
    System.out.println(square1.getArea());

    var cube = new Cuboid();
    System.out.println(cube.getArea());

    List<Shape> shapes = List.of(rect1,circle1, rect2, square1);
    System.out.println(shapes);
    System.out.println(AreaCalculator.getAreaOfRectangles(shapes));
 }
}
