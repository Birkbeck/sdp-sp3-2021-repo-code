package typeerasure;

public class UnboundedMethod {

  /*
   * Counts the number of occurrences of an element in an Array
   */
//  public static <T> int count(T[] anArray, T element){
//    int count = 0;
//    for (T elem : anArray){
//      if (elem.equals(element)){
//        count++;
//      }
//    }
//    return count;
//  }

  public static int count(Object[] anArray, Object element){
    int count = 0;
    for (Object elem : anArray){
      if (elem.equals(element)){
        count++;
      }
    }
    return count;
  }

}
