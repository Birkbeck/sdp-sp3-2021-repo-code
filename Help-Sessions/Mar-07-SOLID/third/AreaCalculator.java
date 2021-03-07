package third;

import java.util.List;

class AreaCalculator {
  static double getAreaOfRectangles(List<? extends Shape> rects) {
    double sum = 0;
    for (var r : rects) {
      sum += r.getArea();
    }
    return sum;
  }
}
