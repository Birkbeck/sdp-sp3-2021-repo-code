package third;

class Cuboid implements Shape {
  public double getArea(){
    throw new RuntimeException();
  }

  public String toString(){
    return this.getClass().getName();
  }
}