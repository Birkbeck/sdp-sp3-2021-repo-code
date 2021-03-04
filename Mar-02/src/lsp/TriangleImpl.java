package ocp;

class TriangleImpl implements Triangle {
  private int height;
  private int width;

  TriangleImpl(int height, int width){
    this.height = height;
    this.width = width;
  }

  @Override
  public double getArea() {
    return 0.5 * height * width;
  }
}
