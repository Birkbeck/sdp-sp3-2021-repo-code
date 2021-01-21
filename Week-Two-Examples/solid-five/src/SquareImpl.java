public class SquareImpl implements Square{
  private double length;

  public SquareImpl(double d){
    length = d;
  }

  @Override
  public double area() {
    return getLength() * getLength();
  }

  @Override
  public double getLength() {
    return length;
  }

  @Override
  public void setLength(double d) {
    length = d;
  }
}
