public class CircleImpl implements Circle {
  private double radius;

  public CircleImpl() {
    this(1.0);
  }

  public CircleImpl(double r) {
    setRadius(r);
  }

  @Override
  public double getRadius() {
    return radius;
  }

  @Override
  public void setRadius(double r) {
    radius = r;
  }

  @Override
  public double area() {
    return Math.PI * getRadius() * getRadius();
  }
}
