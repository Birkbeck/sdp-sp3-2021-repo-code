package factory;

class Main {
  public static void main(String[] args) {
    var ls = List.of(1,2,3); // factory method
    var anInt = Integer.valueOf(3);
    //Creator factory = new ConcreteCreator();
    //Product p1 = ConcreteCreator.getProduct();
    //Creator f = Creator.getFactory();
    Product p2 = ConcreteCreator.getProduct("Thing");
    Product p3 = ConcreteCreator.getProduct("Steel");
  }
}

interface Product {}

class ConcreteProduct implements Product {}

abstract class Thing implements Product {}

class ThingProduct extends Thing {}

class AnotherThingProduct extends Thing {}

abstract class MetalProduct implements Product {}

class SteelProduct extends MetalProduct {}
class FabricatedSteelProduct extends MetalProduct {}


abstract class Creator {
  public static Product getProduct(){ return new ConcreteProduct();}
  public static Product getProduct(String s){return Creator.getProduct();}
  //static Creator getInstance() { return new IoCCreator();}
}

class ConcreteCreator extends Creator {
  public static Product getProduct(String s){
    switch (s){
      case "Thing": return new ThingProduct();
      // or return new AnotherThingProduct();
      case "Steel": return new FabricatedSteelProduct();
      // or return new SteelProduct();
      case "AnotherThing": 
      default: return Creator.getProduct();
    }
  }
}

// class IoCCreator extends Creator {

// }

