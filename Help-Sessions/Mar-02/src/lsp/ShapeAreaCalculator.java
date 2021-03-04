package lsp;

import java.util.List;

class ShapeAreaCalculator {
  static double sumOfArea(List<? extends Shape> lt){
    double sum = 0;
    for (Shape r : lt) {
      sum += r.getArea();
    }
    return sum;
  }
}
