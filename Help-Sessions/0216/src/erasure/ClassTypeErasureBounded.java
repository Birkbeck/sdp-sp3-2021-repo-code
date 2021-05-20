package erasure;

//public class ClassTypeErasureBounded<E extends Comparable<E>> {
//  private E[] elements;
//  private int position;
//
//  public ClassTypeErasureBounded(int capacity) {
//    this.elements = (E[]) new Object[capacity];
//    position = 0;
//  }
//
//  public void add(E data) { elements[position++] = data; }
//
//  public E get(int location) { return elements[location];}
//}

public class ClassTypeErasureBounded {
  private Comparable[] elements;
  private int position;

  public ClassTypeErasureBounded(int capacity) {
    this.elements = (Comparable[]) new Object[capacity];
    position = 0;
  }

  public void add(Comparable data) { elements[position++] = data; }

  public Comparable get(int location) { return elements[location]; }
}