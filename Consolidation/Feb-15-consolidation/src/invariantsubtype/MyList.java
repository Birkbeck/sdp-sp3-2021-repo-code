package invariantsubtype;

import java.util.Collection;

public class MyList<T>  {
  public boolean add(T t) {
    return false;
  }

  public boolean addAll(Collection<T> c) {
    return false;
  }
}
