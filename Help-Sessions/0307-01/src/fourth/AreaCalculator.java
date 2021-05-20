package fourth;

import java.util.List;

class AreaCalculator {
  static double areaOfShapes(List<? extends Shape> rects) {
    double sum = 0;
    for (var r : rects) {
      sum += r.area();
    }
    return sum;
  }
}
