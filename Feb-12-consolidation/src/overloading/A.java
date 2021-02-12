package overloading;

public interface A {
  String getStr();

  String getSensibleName();

  String getValue();

  String getValue(String s);

  default String aMethod(){ return "default method";}

  default String anotherMethod() { return "another default method";}

  @Override
  boolean equals(Object o);

  @Override
  int hashCode();

  @Override
  String toString();
}
