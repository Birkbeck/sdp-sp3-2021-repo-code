package demo;

public interface A {
  String getStr();

  void setStr(String str);

  String getAnother();

  void setAnother(String another);

  @Override
  boolean equals(Object o);

  @Override
  int hashCode();

  @Override
  String toString();
}
