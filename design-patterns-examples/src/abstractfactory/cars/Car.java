package abstractfactory.cars;

public class Car {

  private CarWindow mwindow;
  private CarEngine mengine;

  public Car(CarFactoryInterface factory) {
    // Use the factory to fill in the parts
    mwindow = factory.getWindow();
    mengine = factory.getEngine();
  }

  @Override
  public String toString() {
    return mwindow.toString() + " " + mengine.toString();
  }
}
