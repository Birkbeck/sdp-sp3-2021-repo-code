package typeerasure;

class NodeBounded<T extends Comparable<T>> {
  private T data;
  private Node<T> next;

  public NodeBounded(T data, Node<T> next){
    this.data = data;
    this.next = next;
  }
}

class BoundedNode {
  private Comparable data;
  private Node next;

  public BoundedNode(Comparable data, Node next){
    this.data = data;
    this.next = next;
  }
}
