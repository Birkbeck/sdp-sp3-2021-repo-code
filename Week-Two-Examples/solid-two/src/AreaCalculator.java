import java.util.Arrays;

public class AreaCalculator {
  public static double totalArea(Rectangle[] arrOfShapes){
    var sum = 0.0;
    for (var shape : arrOfShapes){
      sum += shape.area();
    }
    return sum;
  }

  public static double totalArea(Circle[] arrOfShapes){
    var sum = 0.0;
    for (var shape : arrOfShapes){
      sum += shape.area();
    }
    return sum;
  }
}
