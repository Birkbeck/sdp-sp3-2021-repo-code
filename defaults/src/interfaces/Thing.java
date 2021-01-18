package interfaces;

interface Thingy {
  default boolean alive() {
    return false;
  }
}

interface Fly extends Thingy {
  default String eat() {
    return "Vomit absorb... repeat";
  }
}

interface Person extends Thingy {
  default String eat() {
    return "chewing and swallow";
  }
}

interface Huly extends Fly, Person {
  default String eat() {
    return Fly.super.eat();
  }
}

class FlyImpl implements Fly {
}

class PersonImpl implements Person {
  public boolean alive() {
    return true;
  }
}

class HulyImpl implements Huly {
}

public class Thing {
  public static void main(String[] args) {
    final Huly h = new HulyImpl();
    System.out.println("h is alive? = " + h.alive());
    System.out.println(h.eat());
  }
}