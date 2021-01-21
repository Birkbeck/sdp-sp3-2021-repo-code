import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle {
  private double height;
  private double width;

  public static double totalArea(Rectangle[] arrOfRectangles) {
    double area = 0.0;
    for (var rect : arrOfRectangles) {
      area += rect.area();
    }
    return area;
  }

  public double area() {
    return getHeight() * getWidth();
  }
}