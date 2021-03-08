package first;

import java.util.List;

class AreaCalculator {
  static double getAreaOfRectangles(List<Rectangle> rects) {
    double sum = 0;
    for (var r : rects) {
      sum += r.getArea();
    }
    return sum;
  }
}