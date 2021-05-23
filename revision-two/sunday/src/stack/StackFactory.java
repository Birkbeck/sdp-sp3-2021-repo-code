package stack;

public final class StackFactory {
  private StackFactory(){}

  public static <T> Stack<T> getInstance(){
    return new StackImplementation<T>();
  }
}