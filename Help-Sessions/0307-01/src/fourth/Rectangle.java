package fourth;

class Rectangle implements Shape {
  int length;
  int width;

  Rectangle(int length, int width){
    this.length = length;
    this.width = width;
  }

  @Override
  public double area(){
    return length * width;
  }

  @Override
  public String toString(){
    return "width: " + width + " length: " + length;
  }
}
