package list;

public interface List<T> {
  boolean add(T item);
  boolean remove(T item);
  T first();
  boolean next();
  T nextItem();
}
