package ocp;

public class CircleImpl implements Circle {
  private double radius;
  public CircleImpl(double radius){
    setRadius(radius);
  }

  public double getRadius(){
    return radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getArea(){
    return Math.PI * getRadius() * getRadius();
  }
}