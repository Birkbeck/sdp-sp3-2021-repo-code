package genericmethods;

public class Main {
  public static void main(String[] args) {
    Integer[] il = {1,2,3,4,4,5,3};
    System.out.println(countOccurrences(il,3));
  }

  public static <T> int countOccurrences(T[] lst, T itemToCount){
    int count = 0;
    for (T listItem : lst){
      if (itemToCount.equals(listItem)){
        count++;
      }
    }
    return count;
  }
}
