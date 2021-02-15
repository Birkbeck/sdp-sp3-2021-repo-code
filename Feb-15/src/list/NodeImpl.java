package list;

abstract class NodeImpl<T> implements Node<T> {
  private T value;
  private Node<T> next;

  NodeImpl(T value, Node<T> next) {
    this.value = value;
    this.next = next;
  }

  @Override
  public T getValue() {
    return value;
  }

  @Override
  public Node<T> getNext() {
    return next;
  }
}
