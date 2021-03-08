package fourth;

class Square implements Shape {
  double length;

  Square(double size){
    length = size;
  }

  public double area(){
    return length * length;
  }

  public String toString(){
    return "Size: " + length;
  }
}
