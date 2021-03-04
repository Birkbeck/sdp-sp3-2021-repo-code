package q2;

import java.util.Arrays;

public class StringUtils {
  public static int eChecker(String s1, String s2){
    int compareFlag = 0;
    if (s1.contains("e") && !s2.contains("e")){
      compareFlag = -1;
    } else if (s2.contains("e") && !s1.contains("e")){
      compareFlag = 1;
    }
    return compareFlag;
  }
}

class Main {
  public static void main(String[] args) {
    String[] words = {"hi", "hello", "hola", "bye", "goodbye", "adios"};
    Arrays.sort(words,StringUtils::eChecker);
  }
}
