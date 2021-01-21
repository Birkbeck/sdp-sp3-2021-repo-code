public class Driver {
  public static void main(String... args) {
    Rectangle r1 = new RectangleImpl(2.0, 4.0);
    Rectangle r2 = new RectangleImpl(1.5, 2.0);

    System.out.println("Total area of Rectangles: " + AreaCalculator.totalArea(r1,r2));

    Circle c1 = new CircleImpl(1.5);
    Circle c2 = new CircleImpl(2.0);

    System.out.println("Total area of Circles: " + AreaCalculator.totalArea(c1,c2));

    var shapes = new Shape[]{r1, r2, c1, c2};

    System.out.println("Total area of shapes: " + AreaCalculator.totalArea(shapes));
  }
}
