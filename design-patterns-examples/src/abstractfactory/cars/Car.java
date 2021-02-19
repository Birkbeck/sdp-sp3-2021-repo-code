package abstractfactory.cars;

public class Car {

    private CarWindow mwindow;
    private CarEngine mengine;
    private CarFactoryInterface mfactory;

    public Car(CarFactoryInterface factory) {
        // Use the factory to fill in the parts
        mwindow = factory.getWindow();
        mengine = factory.getEngine();
        mfactory = factory;
    }

    public String toString() {
        return mwindow.toString() + " " + mengine.toString();
    }
}
