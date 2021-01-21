interface Heater {
  boolean on();

  boolean off();
}

interface Pump {
}

public class CoffeeMaker {
  private Heater h;
  private Pump p;

//  public CoffeeMaker(){
//    h = new HeaterImpl();
//    p = new PumpImpl();
//  }

  public CoffeeMaker(Heater h, Pump p) {
    this.h = h;
    this.p = p;
  }
}

class HeaterImpl implements Heater {

  @Override
  public boolean on() {
    return true;
  }

  @Override
  public boolean off() {
    return false;
  }
}

class PumpImpl implements Pump {
}

class NewHeaterImpl implements Heater {
  @Override
  public boolean on() {
    return false;
  }

  @Override
  public boolean off() {
    return false;
  }
}