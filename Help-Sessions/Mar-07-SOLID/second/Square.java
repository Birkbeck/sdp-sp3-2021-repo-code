package second;

class Square implements Shape {
  double length;

  Square(double size){
    length = size;
  }

  public double getArea(){
    return length * length;
  }

  public String toString(){
    return "Size: " + length;
  }
}