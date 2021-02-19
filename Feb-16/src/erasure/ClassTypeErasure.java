package erasure;

//public class ClassTypeErasure<E> {
//  private E[] elements;
//  private int position;
//
//  public ClassTypeErasure(int capacity) {
//    this.elements = (E[]) new Object[capacity];
//    position = 0;
//  }
//
//  public void add(E data) {
//    elements[position++] = data;
//  }
//
//  public E get(int location) {
//    return elements[location];
//  }
//}

public class ClassTypeErasure {
  private Object[] elements;
  private int position;

  public ClassTypeErasure(int capacity) {
    this.elements = new Object[capacity];
    position = 0;
  }

  public void add(Object data) {
    elements[position++] = data;
  }

  public Object get(int location) {
    return elements[location];
  }
}