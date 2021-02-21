package typeerasure;

class NodeBridge<T> {
  private T data;

  public NodeBridge(T data) {
    this.data = data;
  }

  public T getData() {
    System.out.println("getData in NodeBridge");
    return data;
  }

  public void setData(T data) {
    System.out.println("setData in NodeBridge");
    this.data = data;
  }
}

class MyNode extends NodeBridge<Integer> {
  public MyNode(Integer data) {
    super(data);
  }

  @Override
  public Integer getData() {
    System.out.println("getData in MyNode");
    return super.getData();
  }

  @Override
  public void setData(Integer data) {
    System.out.println("setData in MyNode");
    super.setData(data);
  }

  public void setData(Object data) {
    setData((Integer) data);
  }
}

class Main {
  public static void main(String[] args) {
//    MyNode mn = new MyNode(5);
//    NodeBridge n = mn;
//    n.setData("Value");
//    Integer val = mn.getData();
//    System.out.println(val);

    // after type erasure
    MyNode mn = new MyNode(5);
    NodeBridge n = (MyNode)mn;
    n.setData("Value");
    Integer val = (String)mn.getData(); // ClassCastException
    System.out.println(val);

  }
}