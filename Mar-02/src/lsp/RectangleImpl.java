package ocp;

class RectangleImpl implements Rectangle {
  private int length;
  private int width;

  RectangleImpl(int length, int width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double getArea() {
    return length * width;
  }

  @Override 
  public int getHeight(){
    return length;
  }

  @Override
  public int getWidth(){
    return width;
  }
}