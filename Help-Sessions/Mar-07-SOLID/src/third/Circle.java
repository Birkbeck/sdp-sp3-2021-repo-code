package third;

class Circle implements Shape {
  double radius;

  Circle(double radius){
    this.radius = radius;
  }

  public double getArea(){
    return Math.PI * radius * radius;
  }

  public String toString(){
    return "radius: " + radius;
  }
}
