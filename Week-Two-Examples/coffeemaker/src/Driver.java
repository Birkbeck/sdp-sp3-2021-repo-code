public class Driver {
  public static void main(String[] args) {
    CoffeeMaker c = new CoffeeMaker(new HeaterImpl(), new PumpImpl());
    CoffeeMaker c1 = new CoffeeMaker(new NewHeaterImpl(), new PumpImpl());
  }
}

// injection
// constructor
// method