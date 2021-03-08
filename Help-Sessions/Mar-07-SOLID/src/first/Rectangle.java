package first;

import java.util.List;

class Rectangle {
  int length;
  int width;

  Rectangle(int length, int width){
    this.length = length;
    this.width = width;
  }

  double getArea(){
    return length * width;
  }

  // Doesn't belong to any specific instance

  // double getAreaOfRectangles(List<Rectangle> rects){
  //   double sum = 0;
  //   for( var r: rects){
  //     sum+= r.getArea();
  //   }
  //   return sum;
  // }

  // Doesn't belong to this class as it breaks SRP

  // static double getAreaOfRectangles(List<Rectangle> rects){
  //   double sum = 0;
  //   for( var r: rects){
  //     sum+= r.getArea();
  //   }
  //   return sum;
  // }

  public String toString(){
    return "width: " + width + " length: " + length;
  }
}