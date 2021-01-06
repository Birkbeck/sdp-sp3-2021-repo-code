package samtwo;

import java.io.IOException;
import java.io.OutputStream;

public interface MyInterface {

  void printIt(String text);

  default public void printUtf8To(String text, OutputStream outputStream) {
    try {
      outputStream.write(text.getBytes("UTF-8"));
    } catch (IOException e) {
      throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
    }
  }

  static void printItToSystemOut(String text) {
    System.out.println(text);
  }
}