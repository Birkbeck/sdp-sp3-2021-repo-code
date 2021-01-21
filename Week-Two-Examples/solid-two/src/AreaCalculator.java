import java.util.Arrays;

public class AreaCalculator {
  public static double totalArea(Shape... arrOfShapes){
    var sum = 0.0;
    for (var shape : arrOfShapes){
      sum += shape.area();
    }
    return sum;
  }
}
