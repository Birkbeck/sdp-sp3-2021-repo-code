public class Driver {
  public static void main(String... args) {
    Rectangle r1 = new RectangleImpl(2.0, 4.0);
    Rectangle r2 = new RectangleImpl(1.5, 2.0);

    var shapes = new Shape[]{r1,r2};
    System.out.println("Total area of Rectangles: " + AreaCalculator.totalArea(shapes));

    Circle c1 = new CircleImpl(1.5);
    Circle c2 = new CircleImpl(2.0);

    shapes = new Shape[]{c1,c2};
    System.out.println("Total area of Circles: " + AreaCalculator.totalArea(shapes));

    Square sq = new SquareImpl(2.5);

    System.out.println("Area of Square is: " + sq.area());

    shapes = new Shape[]{r1, r2, c1, c2, sq};

    System.out.println("Total area of shapes: " + AreaCalculator.totalArea(shapes));
  }
}
