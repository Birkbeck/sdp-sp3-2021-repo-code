import java.util.Arrays;

public class AreaCalculator {
  public static double totalArea(Rectangle[] arrOfRect){
    var sum = 0.0;
    for (var shape : arrOfRect){
      sum += shape.area();
    }
    return sum;
  }

  public static double totalArea(Circle[] arrOfCirc){
    var sum = 0.0;
    for (var shape : arrOfCirc){
      sum += shape.area();
    }
    return sum;
  }
}
