package fourth;

class Cuboid implements Shape, ThreeDShape {
  @Override
  public double area() {
    return 0;
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }

  @Override
  public double volume() {
    return 0;
  }
}