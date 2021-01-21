public class RectangleImpl implements Rectangle {
  private double height;
  private double width;

  public RectangleImpl(double height, double width) {
    setHeight(height);
    setWidth(width);
  }

  @Override
  public double getHeight() {
    return height;
  }

  @Override
  public void setHeight(double h) {
    height = h;
  }

  @Override
  public double getWidth() {
    return width;
  }

  @Override
  public void setWidth(double w) {
    width = w;
  }

  @Override public double area() {
    return getHeight() * getWidth();
  }
}
