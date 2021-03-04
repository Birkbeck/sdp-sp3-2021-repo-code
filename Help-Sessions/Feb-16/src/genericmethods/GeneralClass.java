package genericmethods;

public class GeneralClass {
  public static void main(String[] args) {
    String[] strArr = {"One", "Two", "Three", "Two", "Three", "Two", "Three", "Two", "Three"};
    System.out.println(countOccurrences(strArr, "Two"));
    Integer[] intArr = {1,2,3,4,3,4,2,5,6,4,7};
    System.out.println(countOccurrences(intArr, 4));
  }

  public static <T> int countOccurrences(T[] lst, T item){
    int count = 0;
    for (T s : lst){
      if (item.equals(s)){
        count++;
      }
    }
    return count;
  }

  //class T {}
}