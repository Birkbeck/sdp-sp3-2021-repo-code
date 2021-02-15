package wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyList<T> {
  private List<T> l = new ArrayList<>();

  // Add all the items from the collection to the list
  public void addAll(Collection<? extends T> collection) {
    for (T item : collection) {
      l.add(item);
    }
  }

  // Add all the items from MyList to a collection
  public void addAllTo(Collection<? super T> collection){
    // remove all items from MyList and add them to the collection
    while (!l.isEmpty()){
      T item = l.remove(0);
      collection.add(item);
    }
  }

  // Shapes and Rectangles
  // Okay to "addAll" Rectangles to Shapes
  // Not okay to "addAll" Shapes to Rectangles
  // Okay to "addAllTo" Rectangles to Shapes
  // Not okay to "addAllTo" Shapes to Rectangles
}
