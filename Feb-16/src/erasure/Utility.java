package erasure;

public class Utility {
//  public static <Type> boolean containsElement(Type[] elements, Type element){
//    for (Type t : elements){
//      if (t.equals(element)){
//        return true;
//      }
//    }
//    return false;
//  }

  public static boolean containsElement(Object[] elements, Object element){
    for (Object t : elements){
      if (t.equals(element)){
        return true;
      }
    }
    return false;
  }
}
