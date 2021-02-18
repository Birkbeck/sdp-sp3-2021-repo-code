package erasure;

import java.util.ArrayList;
import java.util.List;

public abstract class Person{
}

class Cat {}
class Academic extends Person {}

class Student extends Person {}

class Container<T extends Person> {
  List<T> myList = new ArrayList<>();
  private void silly(){
    T x = myList.get(0); // inserted into the bytecode (Person) myList.get(0)
  }
}
class Main {
  public static void main(String[] args) {
    Container<Person> p;
    Container<Academic> a;
    Container<Student> s;
    //Container<Cat> c;
  }
}

// List<T extends Person>  lp - may contain "Academic" and/or "Student"

// At runtime, with reified types, the type information "List..." is retained.

// At runtime, without reified types, type erasure will (probably) have taken place
// and the type of lp will be something like List<Object> or List<Person>
// or in Java simply as a List.

// -> Person.class, Academic.Class, Student.class
// Bytecode has no generics - just List

// source code (java) -> javac (compiler) -> bytecode (.class file)
// Type erasure occurs at compilation phase.
