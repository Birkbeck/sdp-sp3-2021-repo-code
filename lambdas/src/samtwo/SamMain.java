package samtwo;

public class SamMain {
  public static void main(String[] args) {
    MyInterface myInterface = (String text) -> {
      System.out.print(text);
    };
  }
}
