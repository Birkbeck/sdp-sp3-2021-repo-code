package defaults;

interface Base {
  String toString();
  default void doSomething(){ // Single Abstract Method SAM
    System.out.println(">> do something else");
  };
}

class BaseImpl implements Base {
  @Override
  public String toString() {return getClass().getName();}
}

class AnotherBaseImpl implements Base {
  @Override
  public String toString() {return "Something else";}
}


class SubClass extends BaseImpl implements Base{
  @Override
  public String toString() { return "aaaa";}
}

class NewSubClass extends BaseImpl implements Base {
  @Override
  public void doSomething(){
    System.out.println("New version of doSomething");
  }
}

class AnotherNewSubClass extends BaseImpl implements Base {
}

class Main {
  public static void main(String[] args) {
//    Base b = new SubClass();
//    Base b1 = new BaseImpl();
//    Base b2 = new AnotherBaseImpl();
//    Base b3 = new NewSubClass();
    Base b4 = new AnotherNewSubClass();
//    System.out.println(b);
//    System.out.println(b1);
//    System.out.println(b2);
//    b2.doSomething();
//    b3.doSomething();
    System.out.println(b4); // toString from BaseImpl
    b4.doSomething(); // doSomething from Base interface
  }
}