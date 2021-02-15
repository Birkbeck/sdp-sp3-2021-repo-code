package list;

public class DLL<T> extends LinkedList<T>{
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

  private class DLLNode<T> extends NodeImpl<T> {
    private Node<T> prev;

    DLLNode(Node<T> prev, T value, Node<T> next){
      super(value, next);
      this.prev = prev;
    }

    public Node<T> getPrev(){
      return prev;
    }
  }
}
