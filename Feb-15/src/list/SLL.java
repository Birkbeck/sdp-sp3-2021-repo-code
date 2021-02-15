package list;

public class SLL<T> extends LinkedList<T> {
  @Override
  public boolean add(T item) {
    return false;
  }

  @Override
  public boolean remove(T item) {
    return false;
  }

  @Override
  public T first() {
    return null;
  }

  @Override
  public boolean next() {
    return false;
  }

  @Override
  public T nextItem() {
    return null;
  }

  private class SLLNode<T> extends NodeImpl<T> {
    SLLNode(T value, Node<T> next) {
      super(value, next);
    }
  }
}