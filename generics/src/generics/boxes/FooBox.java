package generics.boxes;

import generics.Foo;

public class FooBox {
  private Foo data;

  public FooBox(Foo data) {
    this.data = data;
  }

  public Foo getData() {
    return data;
  }
}
