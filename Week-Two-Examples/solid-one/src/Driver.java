public class Driver {

  public static void main(String... args) {
    var r1 = new Rectangle(2.0, 4.0);
    var r2 = new Rectangle(1.5, 2.0);
    var rectangles = new Rectangle[]{r1, r2};

    System.out.println("Total area of rectangles: " + Rectangle.totalArea(rectangles));
  }
}